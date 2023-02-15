package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Role;
import immobi.tec.immobitec.entities.User;

import java.util.List;

public interface IUserService {
    public User getUserById(int id);

    public List<User> getAllUsers();

    public User addUser(User user);

    public User updateUser(User user);

    public void deleteUser(int id);
}
