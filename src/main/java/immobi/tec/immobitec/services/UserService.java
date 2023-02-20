package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.AppUser;
import immobi.tec.immobitec.entities.Role;
import immobi.tec.immobitec.repositories.AdresseRepository;
import immobi.tec.immobitec.repositories.UserRepository;
import io.jsonwebtoken.lang.Assert;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements IUserService{

    UserRepository userRepository;
    AdresseRepository adresseRepository;

    @Override
    public AppUser getUserById(int id) {
         return userRepository.findById(id).orElse(null) ;
    }

    @Override
    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public AppUser addUser(AppUser user) {
        adresseRepository.save(user.getAdresse());
        return userRepository.save(user);
    }

    @Override
    public AppUser updateUser(AppUser user) {
        return userRepository.save(user);
    }


}
