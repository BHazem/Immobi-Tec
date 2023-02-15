package immobi.tec.immobitec.controllers;

import immobi.tec.immobitec.entities.Role;
import immobi.tec.immobitec.entities.User;
import immobi.tec.immobitec.services.IRoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class RoleController {
    IRoleService iRoleService;
    @GetMapping("/getAllRoles")
    public List<Role> getAllRoles(){
        return  iRoleService.getAllRoles();
    }

    @PostMapping("/addRole")
    @ResponseBody
    public Role addRole(@RequestBody Role role){
        return iRoleService.addRole(role);
    }

    @PutMapping("/updateRole")
    @ResponseBody
    public Role updateRole(@RequestBody Role role){
        return iRoleService.updateRole(role);
    }

    @DeleteMapping("/deleteRole/{id}")
    public void deleteRole(@PathVariable("id") int id){
        iRoleService.deleteRole(id);
    }

    @GetMapping("/getRoleById/{id}")
    public Role getRoleByID(@PathVariable("id") int id){
        return iRoleService.getRoleById(id);
    }
}
