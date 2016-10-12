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
public class DepartmentCourseSchedule {

    private ArrayList<CourseOffering> DepartmentCourseSchedule;
    
    public DepartmentCourseSchedule(){
        DepartmentCourseSchedule = new ArrayList<CourseOffering>();
    }

    public ArrayList<CourseOffering> getCourseSchedule() {
        return DepartmentCourseSchedule;
    }
    public CourseOffering addCourseOffering(){
        CourseOffering courseOffering = new CourseOffering();
        DepartmentCourseSchedule.add(courseOffering);
        return courseOffering;
    }
}
