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
public class SemesterCatalog {
    private ArrayList<Semester> semesterCatalog;
    
    public SemesterCatalog(){
        semesterCatalog = new ArrayList<Semester>();
    }

    public ArrayList<Semester> getSemesterCatalog() {
        return semesterCatalog;
    }
    public Semester addSemester(){
        Semester semester = new Semester();
        semesterCatalog.add(semester);
        return semester;
    }
}
