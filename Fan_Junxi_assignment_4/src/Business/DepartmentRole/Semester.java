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
public class Semester {
    private String semesterName;
    private String semesterTime;
    private CourseOfferingCatalog courseOfferingCatalog;
    
    public Semester(){
        courseOfferingCatalog = new CourseOfferingCatalog();
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public String getSemesterTime() {
        return semesterTime;
    }

    public void setSemesterTime(String semesterTime) {
        this.semesterTime = semesterTime;
    }
    
}
