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
//        
//        double a=5;
//        int b = Integer.parseInt(new java.text.DecimalFormat("0").format(a/3));
//        System.out.println(b);
        
        Report report = new Report();
        report.reportCity();
        
//       int s = generateData.riskCalculate("male", 40, 180, 55, 145, 135, 85, "Yes", "Yes");
        //        System.out.println(s);
        //        String datestr = "2002-01-29 04:37:21.0";
        //        Timestamp ts = Timestamp.valueOf(datestr);
        //        System.out.println(ts);

    }

}
