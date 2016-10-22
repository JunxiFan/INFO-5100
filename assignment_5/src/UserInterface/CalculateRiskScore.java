/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Tools.GenerateData;
import java.util.Scanner;

/**
 *
 * @author fjx19
 */
public class CalculateRiskScore {

    private GenerateData generateData;

    public CalculateRiskScore() {

        generateData = new GenerateData();

    }

    public void getRiskScore() {
        System.out.println("***********************************Calculate CHD Risk***************************************** ");
        Scanner reader = new Scanner(System.in);
        System.out.println("**********Please Enter Information Required Below.**********");
        System.out.println("Gender:");
        String gender = reader.nextLine();
        System.out.println("Age:");
        int age = reader.nextInt();
        System.out.println("Total Cholesterol:");
        int totalC = reader.nextInt();
        System.out.println("HDL-Cholesterol:");
        int hdlC = reader.nextInt();
        System.out.println("LDL-Cholesterol:");
        int ldlC = reader.nextInt();
        System.out.println("Systolic Blood Pressure:");
        int sysBP = reader.nextInt();
        System.out.println("Diastolic Blood Pressure:");
        int diaBP = reader.nextInt();
        System.out.println("Smoker?(Yes-1 or No-2):");
        int smokeNum = reader.nextInt();
        System.out.println("Diabetes?(Yes-1 or No-2):");
        int diabetesNum = reader.nextInt();
        String smoke;
        String diabetes;
        if (smokeNum == 1) {
            smoke = "Yes";
        } else {
            smoke = "No";
        }
        if (diabetesNum == 1) {
            diabetes = "Yes";
        } else {
            diabetes = "No";
        }
        int result = generateData.riskCalculate(gender, age, totalC, hdlC, ldlC, sysBP, diaBP, smoke, diabetes);

        System.out.println("The CHD risk is: " + result + "%");
    }
}
