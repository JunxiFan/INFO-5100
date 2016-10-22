/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.*;
import Tools.GenerateData;
import java.util.Scanner;

/**
 *
 * @author fjx19
 */
public class Report {

    private City city;
    private GenerateData generateData;

    public Report() {
        city = new City();
        Initialize inti = new Initialize(city);
        inti.iniData();
        generateData = new GenerateData();
    }

    public void reportCity() {
        System.out.println("******************Reports*************************");
        System.out.println("*********Welcome to the CITY LEVEL ECOSYSTEM*************** ");
        System.out.println("*********Please enter the choice below for Reports*************** ");
        System.out.println("1.CITY LEVEL REPORTS");
        System.out.println("2.COMMUNITY LEVEL REPORTS");
        System.out.println("3.HOUSE LEVEL REPORTS");
        System.out.println("4.FAMILY LEVEL REPORTS");
        System.out.println("5.PERSON LEVEL REPORTS");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a choice. ");
        int choice = reader.nextInt();

        switch (choice) {
            case 1:
                System.out.println("****************************************CITY LEVEL REPORTS****************************************");
                System.out.println("1. How many men have risk of getting a heart disease(CHD risk >25%)? What is the ratio?");
                System.out.println("    There are " + getMenHaveRisk() + " males in the city have risk.");
                String maleHaveRiskRatio = String.format("%.2f", ((double) getMenHaveRisk()) / getMenNum());
                System.out.println("    The ratio is: " + maleHaveRiskRatio);

                System.out.println("2. How many women have risk of getting a heart disease(CHD risk score >25%)? What is the ratio?");
                System.out.println("    There are " + getWomenHaveRisk() + " women in the city have risk.");
                String femaleHaveRiskRatio = String.format("%.2f", ((double) getWomenHaveRisk()) / getWomenNum());
                System.out.println("    The ratio is: " + femaleHaveRiskRatio);

                System.out.println("3. What is the ratio of people who have the risk of getting a heart disease?");
                String peopleHaveRiskRatio=String.format("%.2f", ((double) getMenHaveRisk()+(double)getWomenHaveRisk()) / (getMenNum()+getWomenNum()));
                System.out.println("    The ratio is: "+peopleHaveRiskRatio);
                break;
            case 2:
                System.out.println("****************************************COMMUNITY LEVEL REPORTS****************************************");
                System.out.println("1. ");
                break;
            case 3:
                System.out.println("****************************************HOUSE LEVEL REPORTS****************************************");
                break;
            case 4:
                System.out.println("****************************************FAMILY LEVEL REPORTS****************************************");
                break;
            case 5:
                System.out.println("****************************************PERSON LEVEL REPORTS****************************************");
                break;

        }
    }

    private int getMenNum() {
        int count = 0;
        for (Community community : city.getCommunityCatalog()) {
            for (House house : community.getHouseCatalog()) {
                for (Family family : house.getFamilyCatalog()) {
                    for (Person p : family.getPersonCatalog()) {
                        if (p.getGender().equals("male")) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    private int getWomenNum() {
        int count = 0;
        for (Community community : city.getCommunityCatalog()) {
            for (House house : community.getHouseCatalog()) {
                for (Family family : house.getFamilyCatalog()) {
                    for (Person p : family.getPersonCatalog()) {
                        if (p.getGender().equals("female")) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    private int getMenHaveRisk() {
        String gender;
        int age;
        int averTotalC = 0;
        double totalTotalC = 0;
        int averHDLC = 0;
        double totalHDLC = 0;
        int averLDLC = 0;
        double totalLDLC = 0;
        int averSysBP = 0;
        double totalSysBP = 0;
        int averDiaBP = 0;
        double totalDiaBP = 0;
        String smoke;
        String diabetes;
        int countMen = 0;

        for (Community community : city.getCommunityCatalog()) {
            for (House house : community.getHouseCatalog()) {
                for (Family family : house.getFamilyCatalog()) {
                    for (Person p : family.getPersonCatalog()) {
                        age = p.getAge();
                        smoke = p.getSmoker();
                        diabetes = p.getDiabetes();
                        if (p.getGender().equals("male")) {
                            for (VitalSign vs : p.getVitalSignCatalog().getVitalSignCatalog()) {

                                totalTotalC = totalTotalC + vs.getTotalCholesterol();
                                totalHDLC = totalHDLC + vs.getHDLCholesterol();
                                totalLDLC = totalLDLC + vs.getLDLCholesterol();
                                totalSysBP = totalSysBP + vs.getSystolic();
                                totalDiaBP = totalDiaBP + vs.getDiastolic();
                            }
                        }
                        averTotalC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalTotalC / 5));
                        averHDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalHDLC / 5));
                        averLDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalLDLC / 5));
                        averSysBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalSysBP / 5));
                        averDiaBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalDiaBP / 5));
                        int resultScore = generateData.riskCalculate("male", age, averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, smoke, diabetes);
                        if (resultScore > 25) {
                            countMen++;
                        }
                        totalTotalC = 0;
                        totalHDLC = 0;
                        totalLDLC = 0;
                        totalSysBP = 0;
                        totalDiaBP = 0;
                    }
                }
            }
        }
        return countMen;
    }

    private int getWomenHaveRisk() {
        String gender;
        int age;
        int averTotalC = 0;
        double totalTotalC = 0;
        int averHDLC = 0;
        double totalHDLC = 0;
        int averLDLC = 0;
        double totalLDLC = 0;
        int averSysBP = 0;
        double totalSysBP = 0;
        int averDiaBP = 0;
        double totalDiaBP = 0;
        String smoke;
        String diabetes;
        int countWomen = 0;

        for (Community community : city.getCommunityCatalog()) {
            for (House house : community.getHouseCatalog()) {
                for (Family family : house.getFamilyCatalog()) {
                    for (Person p : family.getPersonCatalog()) {
                        age = p.getAge();
                        smoke = p.getSmoker();
                        diabetes = p.getDiabetes();
                        if (p.getGender().equals("female")) {
                            for (VitalSign vs : p.getVitalSignCatalog().getVitalSignCatalog()) {

                                totalTotalC = totalTotalC + vs.getTotalCholesterol();
                                totalHDLC = totalHDLC + vs.getHDLCholesterol();
                                totalLDLC = totalLDLC + vs.getLDLCholesterol();
                                totalSysBP = totalSysBP + vs.getSystolic();
                                totalDiaBP = totalDiaBP + vs.getDiastolic();
                            }
                        }

                        averTotalC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalTotalC / 5));
                        averHDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalHDLC / 5));
                        averLDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalLDLC / 5));
                        averSysBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalSysBP / 5));
                        averDiaBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalDiaBP / 5));
                        int resultScore = generateData.riskCalculate("female", age, averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, smoke, diabetes);
                        if (resultScore > 25) {
                            countWomen++;
                        }
                        totalTotalC = 0;
                        totalHDLC = 0;
                        totalLDLC = 0;
                        totalSysBP = 0;
                        totalDiaBP = 0;
                    }
                }
            }
        }
        return countWomen;
    }

}
