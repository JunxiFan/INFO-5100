/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;


import Business.College;
import Business.DepartmentRole.Course;
import Business.DepartmentRole.CourseCatalog;
import Business.UniversityCatalog;
import Business.Initialization;
import Business.University;
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
        

        UniversityCatalog universityCatalog = new UniversityCatalog();
        CourseCatalog courseCatalog = new CourseCatalog();
        Initialization initialization = new Initialization(universityCatalog,courseCatalog);
        for(University uni : universityCatalog.getUniversityCatalog() ){
            System.out.println(uni.getUniversityName());
        }

        
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
               
                System.out.println("***************DEPARTMENT LEVEL REPORTS STARTS******************");
                System.out.println("Calculate GPA of Neerajsing Rajput?");
                System.out.println("answer");
                System.out.println("***************DEPARTMENT LEVEL REPORT ENDS******************");
                break;
            case 2:
                System.out.println("***************COLLEGE LEVEL REPORTS STARTS******************");
                System.out.println("QUESTIONS");
                System.out.println("ANSWERS");
                System.out.println("***************COLLEGE LEVEL REPORT ENDS******************");
                break;
            case 3:
                System.out.println("***************UNIVERSITY LEVEL REPORTS STARTS******************");
                System.out.println("QUESTIONS");
                System.out.println("ANSWERS");
                System.out.println("***************UNIVERSITY LEVEL REPORT ENDS******************");
                break;
            case 4:
                System.out.println("***************EDUCATION ECO SYSTEM LEVEL REPORTS STARTS******************");
                System.out.println("QUESTIONS");
                System.out.println("ANSWERS");
                System.out.println("***************EDUCATION ECO SYSTEM LEVEL REPORT ENDS******************");
                break;
            default:
                System.out.println("INPUT ENTERED IS INCORRECT ASK USER FOR THE INPUT AGAIN EXPLORE WHILE/Do-While loops");
                break;
        }
    }
    


}
