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
public class DepartmentCourseCatalog {
    private ArrayList<Course> DepartmentCourseCatalog;
    
    public DepartmentCourseCatalog(){
        DepartmentCourseCatalog = new ArrayList<Course>();
    }

    public ArrayList<Course> getCourseCatalog() {
        return DepartmentCourseCatalog;
    }
    public Course addCourse(){
        Course course = new Course();
        DepartmentCourseCatalog.add(course);
        return course;
    }
}
