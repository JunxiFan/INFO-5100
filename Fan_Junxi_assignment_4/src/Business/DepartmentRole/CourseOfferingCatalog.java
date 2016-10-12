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
public class CourseOfferingCatalog {
        private ArrayList<CourseOffering> courseOfferingCatalog;
    
    public CourseOfferingCatalog(){
        courseOfferingCatalog = new ArrayList<CourseOffering>();
    }

    public ArrayList<CourseOffering> getCourseOfferingCatalog() {
        return courseOfferingCatalog;
    }
    public CourseOffering addCourseOffering(){
        CourseOffering courseOffering = new CourseOffering();
        courseOfferingCatalog.add(courseOffering);
        return courseOffering;
    }
}
