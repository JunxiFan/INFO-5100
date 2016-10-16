/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.DepartmentRole.Course;
import Business.DepartmentRole.CourseCatalog;
import Business.DepartmentRole.CourseLoad;
import Business.DepartmentRole.CourseLoadCatalog;
import Business.DepartmentRole.CourseOffering;
import Business.DepartmentRole.CourseOfferingCatalog;
import Business.DepartmentRole.Degree;
import Business.DepartmentRole.DegreeCatalog;
import Business.DepartmentRole.Role;
import Business.DepartmentRole.RoleCatalog;
import Business.DepartmentRole.Semester;
import Business.DepartmentRole.SemesterCatalog;
import Business.DepartmentRole.Teacher;
import Business.DepartmentRole.TeacherCatalog;
import Business.DepartmentRole.Transcript;
import Business.DepartmentRole.TranscriptCatalog;
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
    SemesterCatalog semesterCatalog;
    DegreeCatalog degreeCatalog;
    CourseOfferingCatalog courseOfferingCatalog;
    CourseLoadCatalog courseLoadcatalog;
    StudentCatalog studentCatalog;
    TeacherCatalog teacherCatalog;
    RoleCatalog roleCatalog;
    TranscriptCatalog transcriptCatalog;

    public Initialization(UniversityCatalog uc, CourseCatalog cc, SemesterCatalog sc, DegreeCatalog dc, CourseOfferingCatalog coc, CourseLoadCatalog clc, StudentCatalog stuC, TeacherCatalog tc, RoleCatalog rc, TranscriptCatalog transC) {
        this.universityCatalog = uc;
        this.courseCatalog = cc;
        this.semesterCatalog = sc;
        this.degreeCatalog = dc;
        this.courseOfferingCatalog = coc;
        this.courseLoadcatalog = clc;
        this.studentCatalog = stuC;
        this.teacherCatalog = tc;
        this.roleCatalog = rc;
        this.transcriptCatalog = transC;

        try {

            this.initialUniversity("data\\University.txt");
            this.initialCourse("data\\Course.txt");
            this.initialSemeter("data\\Semester.txt");
            this.initialDegree("data\\Degree.txt");
            this.initialCourseOffering("data\\CourseOffering.txt");
            this.initialCourseLoad("data\\CourseLoad.txt");
            this.initialStudent("data\\Students.txt");
            this.initialTeacher("data\\Teacher.txt");
            this.initialRole("data\\Role.txt");
            this.initialTranscript("data\\Transcript.txt");

        } catch (Exception e) {

        }

    }

    private void initialTranscript(String s) throws IOException {
        BufferedReader bufferedReader = this.readfile(s);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] lineList = line.split(",");
            Transcript transcript = transcriptCatalog.addTranscript();
            transcript.setStuID(lineList[0]);
            transcript.setCourseGrade1(lineList[1]);
            transcript.setCourseGrade2(lineList[2]);
            transcript.setCourseGrade3(lineList[3]);

//            System.out.println(role.getRoleWorkTime());
        }
    }

    private void initialRole(String s) throws IOException {
        BufferedReader bufferedReader = this.readfile(s);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] lineList = line.split(",");
            Role role = roleCatalog.addRole();
            role.setRoleTyepe(lineList[0]);
            role.setRoleWorkTime(lineList[1]);
            role.setRoleName(lineList[2]);
            role.setDepartmentName(lineList[3]);
            role.setCollegeName(lineList[4]);
            role.setUniversityName(lineList[5]);
            role.setPhD(lineList[6]);

//            System.out.println(role.getRoleWorkTime());
        }
    }

    private void initialStudent(String s) throws IOException {
        BufferedReader bufferedReader = this.readfile(s);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] lineList = line.split(",");
            Student student = studentCatalog.addStudent();
            student.setStuId(lineList[0]);
            student.setStuName(lineList[1]);
            student.setDepartmentName(lineList[2]);
            student.setCollegeName(lineList[3]);
            student.setUniversityName(lineList[4]);
//            System.out.println("***************DEPARTMENT LEVEL REPORT ENDS******************");
        }
    }

    private void initialTeacher(String s) throws IOException {
        BufferedReader bufferedReader = this.readfile(s);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] lineList = line.split(",");
            Teacher teacher = teacherCatalog.addTeacher();
            teacher.setTeacherName(lineList[0]);
            teacher.setCourse(lineList[1]);
            teacher.setDepartmentName(lineList[2]);
            teacher.setCollegeName(lineList[3]);
            teacher.setUniversityName(lineList[4]);
//            System.out.println("***************DEPARTMENT LEVEL REPORT ENDS******************");
        }
    }

    private void initialCourseLoad(String s) throws IOException {
        BufferedReader bufferedReader = this.readfile(s);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] lineList = line.split(",");
            CourseLoad courseLoad = courseLoadcatalog.addCourseLoad();
            courseLoad.setStuID(lineList[0]);
            courseLoad.setCourseID1(lineList[1]);
            courseLoad.setCourseID2(lineList[2]);
            courseLoad.setCourseID3(lineList[3]);
//            System.out.println("***************DEPARTMENT LEVEL REPORT ENDS******************");
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

    private void initialCourse(String s) throws IOException {
        BufferedReader bufferedReader = this.readfile(s);
        String line;

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

    private void initialSemeter(String s) throws IOException {
        BufferedReader bufferedReader = this.readfile(s);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] lineList = line.split(",");
            Semester semester = semesterCatalog.addSemester();
            semester.setSemesterName(lineList[0]);
            semester.setCourseName(lineList[1]);
            semester.setCourseType(lineList[2]);
            semester.setDepartmentName(lineList[3]);
            semester.setCollegeName(lineList[4]);
            semester.setUniversityName(lineList[5]);
            semester.setCourseRequirement(lineList[6]);

            //semester.setCourseOfferingCatalog(lineList[1]);
        }
    }

    private void initialDegree(String s) throws IOException {
        BufferedReader bufferedReader = this.readfile(s);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] lineList = line.split(",");
            Degree degree = degreeCatalog.addDegree();
            degree.setDegreeName(lineList[0]);
            degree.setDepartmentName(lineList[1]);
            degree.setCollegeName(lineList[2]);
            degree.setUniversityName(lineList[3]);
            degree.setDegreeRequirment(lineList[4]);

            //semester.setCourseOfferingCatalog(lineList[1]);
        }
    }

    private void initialCourseOffering(String s) throws IOException {
        BufferedReader bufferedReader = this.readfile(s);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] lineList = line.split(",");
            CourseOffering courseOffering = courseOfferingCatalog.addCourseOffering();
            courseOffering.setCourseOfferingID(lineList[0]);
            courseOffering.setCourseName(lineList[1]);
            courseOffering.setCourseTime(lineList[2]);
            courseOffering.setCoursePlace(lineList[3]);
            courseOffering.setTeacherName(lineList[4]);
            courseOffering.setCapability(lineList[5]);
            courseOffering.setDepartmentName(lineList[6]);
            courseOffering.setCollegeName(lineList[7]);
            courseOffering.setUniversityName(lineList[8]);
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
                System.out.println("Cannot find file");
            }
            return null;
        } catch (Exception e) {
            System.out.println("error:Cannot read file");

            e.printStackTrace();
            return null;

        }
    }

}
