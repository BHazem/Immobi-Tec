package immobi.tec.immobitec.controllers;

import immobi.tec.immobitec.entities.Adresse;
import immobi.tec.immobitec.entities.Role;
import immobi.tec.immobitec.entities.User;
import immobi.tec.immobitec.repositories.AdresseRepository;
import immobi.tec.immobitec.repositories.UserRepository;
import immobi.tec.immobitec.services.IRoleService;
import immobi.tec.immobitec.services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    IUserService iUserService;
    AdresseRepository adresseRepository;
    IRoleService iRoleService;
    private final UserRepository userRepository;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return  iUserService.getAllUsers();
    }

    @GetMapping("/getAllAdress")
        public List<Adresse> getAllAdress(){
        return  adresseRepository.findAll();
    }

    @PostMapping("/addUser/{RoleId}")
    @ResponseBody
    public User addUser(@RequestBody User user,@PathVariable("RoleId") int id){
        Role role=iRoleService.getRoleById(id);
        user.setRole(role);
        return iUserService.addUser(user);
    }

    @PutMapping("/updateUser")
    @ResponseBody
    public User updateUser(@RequestBody User user){
        return iUserService.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") int id){
        User user= userRepository.findById(id).orElse(null);
        adresseRepository.deleteById(user.getId_user());
        iUserService.deleteUser(id);

    }

    @GetMapping("/getUserById/{id}")
    public User getUserByID(@PathVariable("id") int id){
        return iUserService.getUserById(id);
    }
}
