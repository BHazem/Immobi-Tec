package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.User;
import immobi.tec.immobitec.repositories.AdresseRepository;
import immobi.tec.immobitec.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImp implements IUserService {
    UserRepository userRepository;
    AdresseRepository adresseRepository;

    @Override
    public User getUserById(int id) {
         return userRepository.findById(id).orElse(null) ;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        adresseRepository.save(user.getAdresse());
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
