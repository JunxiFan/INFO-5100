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
public class CourseLoadCatalog {
        private ArrayList<CourseLoad> courseLoadCatalog;
    
    public CourseLoadCatalog(){
        courseLoadCatalog = new ArrayList<CourseLoad>();
    }

    public ArrayList<CourseLoad> getCourseLoadCatalog() {
        return courseLoadCatalog;
    }
    public CourseLoad addCourseLoad(){
        CourseLoad courseLoad = new CourseLoad();
        courseLoadCatalog.add(courseLoad);
        return courseLoad;
    }
}
