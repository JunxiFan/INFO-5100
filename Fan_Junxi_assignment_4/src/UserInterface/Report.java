/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.College;
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
import Business.DepartmentRole.TeacherCatalog;
import Business.DepartmentRole.Transcript;
import Business.DepartmentRole.TranscriptCatalog;
import Business.UniversityCatalog;
import Business.Initialization;
import Business.Student;
import Business.StudentCatalog;
import Business.University;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author fjx19
 */
public class Report {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        UniversityCatalog uc = new UniversityCatalog();
        CourseCatalog cc = new CourseCatalog();
        SemesterCatalog sc = new SemesterCatalog();
        DegreeCatalog dc = new DegreeCatalog();
        CourseOfferingCatalog coc = new CourseOfferingCatalog();
        CourseLoadCatalog clc = new CourseLoadCatalog();
        StudentCatalog stuC = new StudentCatalog();
        TeacherCatalog tc = new TeacherCatalog();
        RoleCatalog rc = new RoleCatalog();
        TranscriptCatalog transC=new TranscriptCatalog();
        Initialization initialization = new Initialization(uc, cc, sc, dc, coc, clc, stuC, tc, rc,transC);
//        for(University uni : universityCatalog.getUniversityCatalog() ){
//            System.out.println(uni.getUniversityName());
//        }

        System.out.println("*********Welcome to the EDUCATION LEVEL ECOSYSTEM*************** ");
        System.out.println("*********Please enter the choice below for Reports*************** ");
        System.out.println("1.DEPARTMENT LEVEL REPORTS");
        System.out.println("2.COLLEGE LEVEL REPORTS");
        System.out.println("3.UNIVERSITY LEVEL REPORTS");
        System.out.println("4.EDUCATION ECO SYSTEM REPORTS");

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a choice. Please enter a number for example just enter 1 for department level reports");
        int choice = reader.nextInt(); // Scans the next token of the input as an int.

        switch (choice) {
            case 1:
                //Retrieving the values from the Initialization file

                System.out.println("**************************************************************DEPARTMENT LEVEL REPORTS STARTS************************************************************************");
                System.out.println("***************School of Management,College of Engineering,Jilin University******************");

                System.out.println("1. What are the courses we teach?");
                for (Course course : cc.getCourseCatalog()) {
                    if (course.getDepartmentName().equals("School of Management") && course.getCollegeName().equals("College of Engineering") && course.getUniversityName().equals("Jilin University")) {
                        System.out.println("      " + course.getCourseName());
                    }
                }
                System.out.println("*************************************************************");

                System.out.println("2. What are the courses we offer at 2016 Second Semester?");
                for (Semester semester : sc.getSemesterCatalog()) {
                    if (semester.getSemesterName().equals("2016 Second Semester") && semester.getDepartmentName().equals("School of Management") && semester.getCollegeName().equals("College of Engineering") && semester.getUniversityName().equals("Jilin University")) {
                        System.out.println("    " + semester.getCourseName());
                    }
                }

                System.out.println("3. Which courses are core and which ones are electives? ");
                System.out.println("    Core course:");
                for (Semester semester : sc.getSemesterCatalog()) {
                    if (semester.getCourseType().equals("core") && semester.getSemesterName().equals("2016 Second Semester") && semester.getDepartmentName().equals("School of Management") && semester.getCollegeName().equals("College of Engineering") && semester.getUniversityName().equals("Jilin University")) {
                        System.out.println("        " + semester.getCourseName() + "    " + semester.getCourseRequirement());
                    }
                }
                System.out.println("    Elective course:");
                for (Semester semester : sc.getSemesterCatalog()) {
                    if (semester.getCourseType().equals("elective") && semester.getSemesterName().equals("2016 Second Semester") && semester.getDepartmentName().equals("School of Management") && semester.getCollegeName().equals("College of Engineering") && semester.getUniversityName().equals("Jilin University")) {
                        System.out.println("        " + semester.getCourseName() + "    " + semester.getCourseRequirement());
                    }
                }

                System.out.println("4.　What are the degree requirements?");
                for (Degree degree : dc.getDegreeCatalog()) {
                    if (degree.getDepartmentName().equals("School of Management") && degree.getCollegeName().equals("College of Engineering") && degree.getUniversityName().equals("Jilin University")) {
                        System.out.println("    " + degree.getDegreeName() + "    " + degree.getDegreeRequirment());
                    }
                }

                System.out.println("5.　What is English Course capacity? How many seats are empty?");

                int count = 0;
                int stuAmountMng = 0;
                int capacity = 0;

                for (CourseOffering courseOffering : coc.getCourseOfferingCatalog()) {
                    if (courseOffering.getCourseName().equals("English") && courseOffering.getDepartmentName().equals("School of Management") && courseOffering.getCollegeName().equals("College of Engineering") && courseOffering.getUniversityName().equals("Jilin University")) {
                        System.out.println("    " + "Capacity" + courseOffering.getCapability());
                        capacity = Integer.parseInt(courseOffering.getCapability());
                    }
                }
                for (CourseLoad courseLoad : clc.getCourseLoadCatalog()) {
                    if (courseLoad.getCourseID1().equals("1")) {
                        count++;
                        stuAmountMng = count;
                    }
                }
                int result = capacity - stuAmountMng;
                System.out.println("There are " + result + " empty seats.");

                System.out.println("6.What is our faculty/student ratio per Engilish class? How do we compare with School of Business?");
                int stuAmountBis = 0;
                int count2 = 0;
                for (CourseLoad courseLoad : clc.getCourseLoadCatalog()) {
                    if (courseLoad.getCourseID1().equals("4")) {
                        count2++;
                        stuAmountBis = count2;
                    }
                }
                System.out.println("The ratio is " + "1 : " + stuAmountMng);
                System.out.println("The ratio of School of Business: " + " 1 : " + stuAmountBis);

                System.out.println("7.What is the average number of students per class? Largest class? Smallest class?");
                int total = 0;
                int min = 1000;
                int max = 0;
                int count3 = 0;
                String largestClass = null;
                String SmallestClass = null;
                for (CourseOffering courseOffering : coc.getCourseOfferingCatalog()) {
                    if (courseOffering.getDepartmentName().equals("School of Management") && courseOffering.getCollegeName().equals("College of Engineering") && courseOffering.getUniversityName().equals("Jilin University")) {
                        total = total + Integer.parseInt(courseOffering.getCapability());
                        count3++;
                        if (Integer.parseInt(courseOffering.getCapability()) > max) {
                            max = Integer.parseInt(courseOffering.getCapability());
                            largestClass = courseOffering.getCourseName();
                        }
                        if (Integer.parseInt(courseOffering.getCapability()) < min) {
                            min = Integer.parseInt(courseOffering.getCapability());
                            SmallestClass = courseOffering.getCourseName();
                        }
                    }
                }
                int average = total / count3;
                System.out.println("    Average:  " + average);
                System.out.println("    Largest Class  " + largestClass);
                System.out.println("    Smallest Class  " + SmallestClass);

                System.out.println("8.What is the current student enrollment in department?");
                for (Student student : stuC.getStudentCatalog()) {
                    if (student.getDepartmentName().equals("School of Management") && student.getCollegeName().equals("College of Engineering") && student.getUniversityName().equals("Jilin University")) {
                        System.out.println("   " + student.getStuName());
                    }
                }

                System.out.println("9.What is the administrative staff to faculty ratio?");
                int countFaculty = 0;
                int countStaff = 0;
                for (Role role : rc.getRoleCatalog()) {
                    if (role.getRoleTyepe().equals("Faculty") && role.getDepartmentName().equals("School of Management") && role.getCollegeName().equals("College of Engineering") && role.getUniversityName().equals("Jilin University")) {
                        countFaculty++;
                    }
                    if (role.getRoleTyepe().equals("Staff") && role.getDepartmentName().equals("School of Management") && role.getCollegeName().equals("College of Engineering") && role.getUniversityName().equals("Jilin University")) {
                        countStaff++;
                    }
                }
                System.out.println("    The ratio is: " + countStaff + ":" + countFaculty);

                System.out.println("10.What is the ratio of full time faculty vs part-time? ");
                int countFullTime = 0;
                int countPartTime = 0;
                for (Role role : rc.getRoleCatalog()) {
                    if (role.getRoleWorkTime().equals("Full-time") && role.getDepartmentName().equals("School of Management") && role.getCollegeName().equals("College of Engineering") && role.getUniversityName().equals("Jilin University")) {
                        countFullTime++;
//                        System.out.println("UserInterface.Report.main()");
                    }
                    if (role.getRoleWorkTime().equals("Part-time") && role.getDepartmentName().equals("School of Management") && role.getCollegeName().equals("College of Engineering") && role.getUniversityName().equals("Jilin University")) {
                        countPartTime++;
//                        System.out.println("UserInterface.Report.main()");
                    }
                }
                System.out.println("    The ratio is: " + countFullTime + ":" + countPartTime);

                System.out.println("11.What is the percentage of faculty with Ph.Ds?");
                int countPhD = 0;
                double percentage;
                for (Role role : rc.getRoleCatalog()) {
                    if (role.getPhD().equals("Ph.D") && role.getDepartmentName().equals("School of Management") && role.getCollegeName().equals("College of Engineering") && role.getUniversityName().equals("Jilin University")) {
                        countPhD++;
                    }
                }
                percentage = ((double) countPhD) / countFaculty;
                System.out.println("    The percentage is:" + percentage * 100 + "%");

                System.out.println("*****************************************DEPARTMENT LEVEL REPORT ENDS***********************************************");

                break;
            case 2:
                System.out.println("*****************************************COLLEGE LEVEL REPORTS STARTS************************************************");
                System.out.println("********************,College of Engineering,Jilin University***********************");
                System.out.println("1.What is the faculty/student ratio?");
                int countFacultyCol = 0;
                int countStuCol = 0;
                for (Role role : rc.getRoleCatalog()) {
                    if (role.getRoleTyepe().equals("Faculty") && role.getCollegeName().equals("College of Engineering") && role.getUniversityName().equals("Jilin University")) {
                        countFacultyCol++;
                    }
                }
                for (Student student : stuC.getStudentCatalog()) {
                    if (student.getCollegeName().equals("College of Engineering") && student.getUniversityName().equals("Jilin University")) {
                        countStuCol++;
                    }
                }
                System.out.println("    The ratio is: " + countFacultyCol + ":" + countStuCol);

                System.out.println("2.What is the average number of students per class? Largest class? Smallest class?");
                int total2 = 0;
                int min2 = 1000;
                int max2 = 0;
                int count4 = 0;
                String largestClass2 = null;
                String SmallestClass2 = null;
                for (CourseOffering courseOffering : coc.getCourseOfferingCatalog()) {
                    if (courseOffering.getCollegeName().equals("College of Engineering") && courseOffering.getUniversityName().equals("Jilin University")) {
                        total2 = total2 + Integer.parseInt(courseOffering.getCapability());
                        count4++;
                        if (Integer.parseInt(courseOffering.getCapability()) > max2) {
                            max2 = Integer.parseInt(courseOffering.getCapability());
                            largestClass2 = courseOffering.getCourseName();
                        }
                        if (Integer.parseInt(courseOffering.getCapability()) < min2) {
                            min2 = Integer.parseInt(courseOffering.getCapability());
                            SmallestClass2 = courseOffering.getCourseName();
                        }
                    }
                }
                double average2 = ((double) total2) / count4;
                System.out.println("    Average:  " + average2);
                System.out.println("    Largest Class  " + largestClass2);
                System.out.println("    Smallest Class  " + SmallestClass2);

                System.out.println("3.What is the number of student enrollment in our college");
                int count5 = 0;
                for (Student student : stuC.getStudentCatalog()) {
                    if (student.getCollegeName().equals("College of Engineering") && student.getUniversityName().equals("Jilin University")) {
                        count5++;
                    }
                }
                System.out.println("    The number is:" + count5);
                
                System.out.println("4.What is the administrative staff to faculty ratio?");
                int countFaculty2 = 0;
                int countStaff2 = 0;
                for (Role role : rc.getRoleCatalog()) {
                    if (role.getRoleTyepe().equals("Faculty")  && role.getCollegeName().equals("College of Engineering") && role.getUniversityName().equals("Jilin University")) {
                        countFaculty2++;
                    }
                    if (role.getRoleTyepe().equals("Staff")  && role.getCollegeName().equals("College of Engineering") && role.getUniversityName().equals("Jilin University")) {
                        countStaff2++;
                    }
                }
                System.out.println("    The ratio is: " + countStaff2 + ":" + countFaculty2);

                System.out.println("5.What is the ratio of full time faculty vs part-time? ");
                int countFullTime2 = 0;
                int countPartTime2 = 0;
                for (Role role : rc.getRoleCatalog()) {
                    if (role.getRoleWorkTime().equals("Full-time") && role.getCollegeName().equals("College of Engineering") && role.getUniversityName().equals("Jilin University")) {
                        countFullTime2++;
                       
                    }
                    if (role.getRoleWorkTime().equals("Part-time")  && role.getCollegeName().equals("College of Engineering") && role.getUniversityName().equals("Jilin University")) {
                        countPartTime2++;
//                        System.out.println("UserInterface.Report.main()");
                    }
                }
                System.out.println("    The ratio is: " + countFullTime2 + ":" + countPartTime2);

                System.out.println("6.What is the percentage of faculty with Ph.Ds?");
                int countPhD2 = 0;
                double percentage2;
                for (Role role : rc.getRoleCatalog()) {
                    if (role.getPhD().equals("Ph.D") && role.getDepartmentName().equals("School of Management") && role.getCollegeName().equals("College of Engineering") && role.getUniversityName().equals("Jilin University")) {
                        countPhD2++;
                    }
                }
                percentage2 = ((double) countPhD2) / countFaculty2;
                System.out.println("    The percentage is:" + percentage2 * 100 + "%");
                System.out.println("*****************************************COLLEGE LEVEL REPORT ENDS*********************************************");
                break;
                
            case 3:
                System.out.println("****************************************UNIVERSITY LEVEL REPORTS STARTS*****************************************");
                System.out.println("*********************************Jilin University************************************");
                System.out.println("1.What is the faculty/student ratio?");
                int countFaculty3 = 0;
                int countStu3 = 0;
                for (Role role : rc.getRoleCatalog()) {
                    if (role.getRoleTyepe().equals("Faculty") && role.getUniversityName().equals("Jilin University")) {
                        countFaculty3++;
                    }
                }
                for (Student student : stuC.getStudentCatalog()) {
                    if ( student.getUniversityName().equals("Jilin University")) {
                        countStu3++;
                    }
                }
                System.out.println("    The ratio is: " + countFaculty3 + ":" + countStu3);
                
                System.out.println("2.Are we profitable?");
                int count6=0;
                int countFaculty4=0;
                int countStaff3=0;
                String result2;
                for(Student student: stuC.getStudentCatalog()){
                    if(student.getUniversityName().equals("Jilin University")){
                        count6++;
                    }
                }
                for (Role role : rc.getRoleCatalog()) {
                    if (role.getRoleTyepe().equals("Faculty")  &&  role.getUniversityName().equals("Jilin University")) {
                        countFaculty4++;
                    }
                    if (role.getRoleTyepe().equals("Staff")   && role.getUniversityName().equals("Jilin University")) {
                        countStaff3++;
                    }
                }
                double income = ((double)count6)*5000;
                double outcome = (((double)countFaculty4)*6000) + (((double)countStaff3)*6500);
                System.out.println("    The balance is"+(income-outcome));
                if(income>=outcome){
                    System.out.println("      We are profitable.");
                }
                else
                    System.out.println("      We are not profitable.");
                
                
                System.out.println("**********************************UNIVERSITY LEVEL REPORT ENDS***************************************");
                break;
            case 4:
                System.out.println("*********************************EDUCATION ECO SYSTEM LEVEL REPORTS STARTS************************************");
                System.out.println("1.What is the average score of English and Math in this area this semester?");
                int countEng = 0;
                int countMath = 0;
                int countStuEco = 0;
                for(Student student : stuC.getStudentCatalog()){
                    countStuEco++;
                }
                for(Transcript transcript : transC.getTranscriptCatalog()){
                    countEng = countEng + Integer.parseInt(transcript.getCourseGrade1());
                    countMath = countMath + Integer.parseInt(transcript.getCourseGrade2());
                }
                java.text.DecimalFormat   df=new   java.text.DecimalFormat("#.##");
                double averEng = ((double)countEng)/countStuEco;
                double averMath = ((double)countMath)/countStuEco; 
                System.out.println("    Average Score of English: "+df.format(averEng));
                System.out.println("    Average Score of Math: "+df.format(averMath));
                
                System.out.println("2.What is the ratio of students who chose Employment Guidance this semester?");
                int countStuEmp=0;
                for(Transcript transcript : transC.getTranscriptCatalog()){
                    if(!transcript.getCourseGrade3().equals("N")){
                        countStuEmp++;
                    }
                } 
                double ratioEmp = ((double)countStuEmp)/countStuEco*100;
                System.out.println("    There are "+ df.format(ratioEmp)+"% students chose Employment Guidance.");
                
                System.out.println("***************EDUCATION ECO SYSTEM LEVEL REPORT ENDS******************");
                break;
            default:
                System.out.println("INPUT ENTERED IS INCORRECT ASK USER FOR THE INPUT AGAIN EXPLORE WHILE/Do-While loops");
                break;
        }
    }

}
