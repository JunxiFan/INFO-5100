/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.DepartmentRole.Course;
import Business.DepartmentRole.CourseCatalog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author fjx19
 */
public class Initialization {

    UniversityCatalog universityCatalog;
    CourseCatalog courseCatalog;
    
    public Initialization(UniversityCatalog universityCatalog,CourseCatalog courseCatalog) {
        this.universityCatalog = universityCatalog;
        this.courseCatalog = courseCatalog;
        
        try {
            
            this.initialUniversity("data\\University.txt");
            this.initialCourse("data\\Course.txt");
            

        } catch (Exception e) {

        }

    }

    private void initialUniversity(String s) throws IOException {
        BufferedReader bufferedReader = this.readfile(s);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] lineList = line.split(",");
            University university = universityCatalog.addUniversity();
            university.setUniversityName(lineList[0]);
            university.setAddress(lineList[1]);
        }
    }
    private void initialCourse(String s) throws IOException{
        BufferedReader bufferedReader = this.readfile(s);
        String line;
//        CourseCatalog courseCatalog = new CourseCatalog();

        while ((line = bufferedReader.readLine()) != null) {
            String[] lineList = line.split(",");
            Course course = courseCatalog.addCourse();
            course.setCourseName(lineList[0]);
            course.setCourseType(lineList[1]);
            course.setDepartmentName(lineList[2]);
            course.setCollegeName(lineList[3]);
            course.setUniversityName(lineList[4]);

        }
    }

    private BufferedReader readfile(String s) {
        try {
            File file = new File(s);
            if (file.isFile() && file.exists()) {
                FileReader read = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(read);
                return bufferedReader;
            } else {
                System.out.println("Cannot find University file");
            }
            return null;
        } catch (Exception e) {
            System.out.println("error:Cannot read university file");

            e.printStackTrace();
            return null;

        }
    }

}
