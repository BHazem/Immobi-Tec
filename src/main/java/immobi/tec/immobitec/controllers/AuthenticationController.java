package immobi.tec.immobitec.controllers;

import immobi.tec.immobitec.Security.AuthenticationRequest;
import immobi.tec.immobitec.Security.AuthenticationResponse;
import immobi.tec.immobitec.Security.CustomUserDetailsService;
import immobi.tec.immobitec.Security.JwtUtil;
import immobi.tec.immobitec.entities.AppUser;
import immobi.tec.immobitec.entities.Role;
import immobi.tec.immobitec.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;


@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtTokenUtil;
    @Autowired
    IRoleService iRoleService;

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
            throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    authenticationRequest.getEmail(), authenticationRequest.getPassword()));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getEmail());

        final String token = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(token));
    }

    @PostMapping
    @RequestMapping(value = "/register/{RoleId}")
    public ResponseEntity<?> saveUser(@RequestBody AppUser user,@PathVariable("RoleId") int id) throws Exception {
        Role role=iRoleService.getRoleById(id);
        user.setRole(role);
        return ResponseEntity.ok(userDetailsService.save(user));
    }

}
