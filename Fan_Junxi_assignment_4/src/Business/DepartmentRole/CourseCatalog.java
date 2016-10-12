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
public class CourseCatalog {
    private ArrayList<Course> courseCatalog;
    
    public CourseCatalog(){
        courseCatalog = new ArrayList<Course>();
    }

    public ArrayList<Course> getCourseCatalog() {
        return courseCatalog;
    }
    public Course addCourse(){
        Course course = new Course();
        courseCatalog.add(course);
        return course;
    }
}
