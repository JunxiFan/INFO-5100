/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.*;
import Tools.GenerateData;
import java.sql.Timestamp;
import java.util.Scanner;

/**
 *
 * @author fjx19
 */
public class MainClass {

    public static void main(String[] args) {
        System.out.println("++++++++++++++Please enter your choice+++++++++++++++");
        System.out.println("1. Calculate CHD Risk.");
        System.out.println("2. Get report about each level.");
        System.out.println("    Your choice: ");
        Scanner reader = new Scanner(System.in);
        int choice = reader.nextInt();

        switch (choice) {
            case 1:
                CalculateRiskScore crs = new CalculateRiskScore();
                crs.getRiskScore();
                break;
            case 2:
                Report report = new Report();
                report.reportCity();
                break;
        }

//       int s = generateData.riskCalculate("male", 40, 180, 55, 145, 135, 85, "Yes", "Yes");
        //        System.out.println(s);
        //        String datestr = "2002-01-29 04:37:21.0";
        //        Timestamp ts = Timestamp.valueOf(datestr);
        //        System.out.println(ts);
    }

}
