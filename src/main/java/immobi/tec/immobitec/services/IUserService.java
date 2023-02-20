package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.AppUser;

import java.util.List;

public interface IUserService {
    public AppUser getUserById(int id);
    public List<AppUser> getAllUsers();
    public AppUser addUser(AppUser user);
    public AppUser updateUser(AppUser user);
}
