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
public class CollegeStudentCatalog {
    private ArrayList<Student> collegeStudentCatalog;
    
    public CollegeStudentCatalog(){
        collegeStudentCatalog = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentCatalog() {
        return collegeStudentCatalog;
    }
    public Student addStudent(){
        Student student = new Student();
        collegeStudentCatalog.add(student);
        return student;
    }
}
