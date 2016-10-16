/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author fjx19
 */
public class UniversityStudentCatalog {
    private ArrayList<Student> universityStudentCatalog;
    
    public UniversityStudentCatalog(){
        universityStudentCatalog = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentCatalog() {
        return universityStudentCatalog;
    }
    public Student addStudent(){
        Student student = new Student();
        universityStudentCatalog.add(student);
        return student;
    }
}
