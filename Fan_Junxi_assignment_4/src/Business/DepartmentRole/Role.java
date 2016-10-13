/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DepartmentRole;

/**
 *
 * @author fjx19
 */
public class Role {
    private String roleTyepe;
    private String roleWorkTime;
    private String roleName;
    private String departmentName;
    private String collegeName;
    private String universityName;
    private String phD;

    public String getPhD() {
        return phD;
    }

    public void setPhD(String phD) {
        this.phD = phD;
    }
    

    public String getRoleWorkTime() {
        return roleWorkTime;
    }

    public void setRoleWorkTime(String roleWorkTime) {
        this.roleWorkTime = roleWorkTime;
    }

    
    public String getRoleTyepe() {
        return roleTyepe;
    }

    public void setRoleTyepe(String roleTyepe) {
        this.roleTyepe = roleTyepe;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    
    
}
