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
public class DepartmentStudentCatalog {

    private ArrayList<Student> departmentStudentCatalog;

    public DepartmentStudentCatalog() {
        departmentStudentCatalog = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentCatalog() {
        return departmentStudentCatalog;
    }

    public Student addStudent() {
        Student student = new Student();
        departmentStudentCatalog.add(student);
        return student;
    }
}
