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
public class ClassroomCatalog {
        private ArrayList<Classroom> classroomCatalog;
    
    public ClassroomCatalog(){
        classroomCatalog = new ArrayList<Classroom>();
    }

    public ArrayList<Classroom> getClassroomCatalog() {
        return classroomCatalog;
    }
    public Classroom addClassroom(){
        Classroom classroom = new Classroom();
        classroomCatalog.add(classroom);
        return classroom;
    }
}
