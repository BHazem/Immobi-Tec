package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Role;

import java.util.List;

public interface IRoleService {
    public Role getRoleById(int id);

    public List<Role> getAllRoles();

    public Role addRole(Role role);

    public Role updateRole(Role role);

    public void deleteRole(int id);

}
