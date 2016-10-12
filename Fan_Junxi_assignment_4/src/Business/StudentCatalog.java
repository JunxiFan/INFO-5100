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
public class StudentCatalog {
    private ArrayList<Student> studentCatalog;
    
    public StudentCatalog(){
        studentCatalog = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentCatalog() {
        return studentCatalog;
    }
    public Student addStudent(){
        Student student = new Student();
        studentCatalog.add(student);
        return student;
    }
}
