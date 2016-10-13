/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DepartmentRole;

import java.util.ArrayList;

/**
 *
 * @author fjx19
 */
public class RoleCatalog {
    private ArrayList<Role> roleCatalog;
    
    public RoleCatalog(){
        roleCatalog = new ArrayList<Role>();
    }

    public ArrayList<Role> getRoleCatalog() {
        return roleCatalog;
    }
    public Role addRole(){
        Role role = new Role();
        roleCatalog.add(role);
        return role;
    }
}
