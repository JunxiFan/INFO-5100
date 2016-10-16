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
public class TeacherCatalog {
    private ArrayList<Teacher> teacherCatalog;
    
    public TeacherCatalog(){
        teacherCatalog = new ArrayList<Teacher>();
    }

    public ArrayList<Teacher> getTeacherCatalog() {
        return teacherCatalog;
    }
    public Teacher addTeacher(){
        Teacher teacher = new Teacher();
        teacherCatalog.add(teacher);
        return teacher;
    }
}
