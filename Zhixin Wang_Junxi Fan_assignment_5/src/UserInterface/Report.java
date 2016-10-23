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
        System.out.println("1.CHECK YOUE OWN CHD RISK SCORE");
        System.out.println("2.CITY LEVEL REPORTS");
        System.out.println("3.COMMUNITY LEVEL REPORTS");
        System.out.println("4.HOUSE LEVEL REPORTS");
        System.out.println("5.FAMILY LEVEL REPORTS");
        System.out.println("6.PERSON LEVEL REPORTS");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a choice. ");
        int choice = Integer.parseInt(reader.nextLine());

        switch (choice) {
            case 1:
                System.out.println("*********Welcome to Check your CHG risk score*************** ");
                Person person = new Person();
                //VitalSign vitalSign =person.getVitalSignCatalog().addVitalSign();
                int age;
                String gender;
                String smoker;
                String diabetes;
                int averTotalC;
                int averHDLC;
                int averLDLC;
                int averSysBP;
                int averDiaBP;

                do {
                    System.out.println("Please enter your age,it must between 30-74");
                    while (!reader.hasNextInt()) {
                        System.out.println("It's not a number");
                        reader.nextLine();
                    }
                    age = Integer.parseInt(reader.nextLine());
                } while (age < 30 || age > 74);
                person.setAge(age);

                do {
                    System.out.println("Please enter your gender,male or female");
                    gender = reader.nextLine();
                } while (!(gender.equals("male") | gender.equals("female")));
                person.setGender(gender);

                System.out.println("Please enter your totalCholesterol");
                while (!reader.hasNextInt()) {
                    System.out.println("Invalid input,please type again");
                    reader.nextLine();
                }
                averTotalC = (Integer.parseInt(reader.nextLine()));

                System.out.println("Please enter your HDLCholesterol");
                while (!reader.hasNextInt()) {
                    System.out.println("Invalid input,please type again");
                    reader.nextLine();
                }
                averHDLC = (Integer.parseInt(reader.nextLine()));

                System.out.println("Please enter your LDLCholesterol");
                while (!reader.hasNextInt()) {
                    System.out.println("Invalid input,please type again");
                    reader.nextLine();
                }
                averLDLC = (Integer.parseInt(reader.nextLine()));

                System.out.println("Please enter your Systolic BP");
                while (!reader.hasNextInt()) {
                    System.out.println("Invalid input,please type again");
                    reader.nextLine();
                }
                averSysBP = (Integer.parseInt(reader.nextLine()));

                System.out.println("Please enter your Diastolic BP");
                while (!reader.hasNextInt()) {
                    System.out.println("Invalid input,please type again");
                    reader.nextLine();
                }
                averDiaBP = (Integer.parseInt(reader.nextLine()));

                do {
                    System.out.println("Are you a smoker? Yes or No.");
                    smoker = reader.nextLine();
                } while (!(smoker.equals("Yes") | smoker.equals("No")));
                person.setSmoker(smoker);

                do {
                    System.out.println("Do you have diabetes? Yes or No.");
                    diabetes = reader.nextLine();
                } while (!(diabetes.equals("Yes") | diabetes.equals("No")));
                person.setDiabetes(diabetes);
                int result = generateData.riskCalculate(person.getGender(), person.getAge(), averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, person.getSmoker(), person.getDiabetes());
                System.out.println("Your rosk score is " + result);
                break;
            case 2:
                System.out.println("****************************************CITY LEVEL REPORTS****************************************");
                System.out.println("1. How many men have risk of getting a heart disease(CHD risk score > 10)? What is the ratio?");
                System.out.println("    There are " + getMenHaveRisk() + " males in the city have risk.");
                String maleHaveRiskRatio = String.format("%.2f", ((double) getMenHaveRisk()) / getMenNum());
                System.out.println("    The ratio is: " + maleHaveRiskRatio);

                System.out.println("2. How many women have risk of getting a heart disease(CHD risk score > 16)? What is the ratio?");
                System.out.println("    There are " + getWomenHaveRisk() + " women in the city have risk.");
                String femaleHaveRiskRatio = String.format("%.2f", ((double) getWomenHaveRisk()) / getWomenNum());
                System.out.println("    The ratio is: " + femaleHaveRiskRatio);

                System.out.println("3. What is the ratio of people who have the risk of getting a heart disease?");
                String peopleHaveRiskRatio = String.format("%.2f", ((double) getMenHaveRisk() + (double) getWomenHaveRisk()) / (getMenNum() + getWomenNum()));
                System.out.println("    The ratio is: " + peopleHaveRiskRatio);
                break;
            case 3:
                System.out.println("****************************************COMMUNITY LEVEL REPORTS****************************************");
                System.out.println("1. In community 40001,how many men have risk of getting a heart disease(CHD risk score > 10)? What is the ratio?");
                System.out.println("    There are " + getMenHaveRiskCom() + " males in the community have risk.");
                String maleHaveRiskRatio1 = String.format("%.2f", ((double) getMenHaveRiskCom()) / getMenNumCom());
                System.out.println("    The ratio is: " + maleHaveRiskRatio1);

                System.out.println("2. In community 40001,how many women have risk of getting a heart disease(CHD risk score > 16)? What is the ratio?");
                System.out.println("    There are " + getWomenHaveRiskCom() + " women in the community have risk.");
                String femaleHaveRiskRatio1 = String.format("%.2f", ((double) getWomenHaveRiskCom()) / getWomenNumCom());
                System.out.println("    The ratio is: " + femaleHaveRiskRatio1);

                System.out.println("3. What is the ratio of people who have the risk of getting a heart disease?");
                String peopleHaveRiskRatio1 = String.format("%.2f", ((double) getMenHaveRiskCom() + (double) getWomenHaveRiskCom()) / (getMenNumCom() + getWomenNumCom()));
                System.out.println("    The ratio is: " + peopleHaveRiskRatio1);
                break;
            case 4:
                System.out.println("****************************************HOUSE LEVEL REPORTS****************************************");
                System.out.println("1. In House 30001,how many men have risk of getting a heart disease(CHD risk score > 10)? What is the ratio?");
                System.out.println("    There are " + getMenHaveRiskHou() + " males in the house have risk.");
                String maleHaveRiskRatio2 = String.format("%.2f", ((double) getMenHaveRiskHou()) / getMenNumHou());
                System.out.println("    The ratio is: " + maleHaveRiskRatio2);

                System.out.println("1. In House 30001,how many men have risk of getting a heart disease(CHD risk score > 10)? What is the ratio?");
                System.out.println("    There are " + getWomenHaveRiskHou() + " females in the house have risk.");
                String femaleHaveRiskRatio2 = String.format("%.2f", ((double) getWomenHaveRiskHou()) / getWomenNumHou());
                System.out.println("    The ratio is: " + femaleHaveRiskRatio2);

                System.out.println("3. What is the ratio of people who have the risk of getting a heart disease?");
                String peopleHaveRiskRatio2 = String.format("%.2f", ((double) getMenHaveRiskHou() + (double) getWomenHaveRiskHou()) / (getMenNumHou() + getWomenNumHou()));
                System.out.println("    The ratio is: " + peopleHaveRiskRatio2);
                break;

            case 5:
                System.out.println("****************************************FAMILY LEVEL REPORTS****************************************");
                System.out.println("1. In Family 20001,how many men have risk of getting a heart disease(CHD risk score > 10)? What is the ratio?");
                System.out.println("    There are " + getMenHaveRiskFam() + " males in the family have risk.");
                String maleHaveRiskRatio3 = String.format("%.2f", ((double) getMenHaveRiskFam()) / getMenNumFam());
                System.out.println("    The ratio is: " + maleHaveRiskRatio3);

                System.out.println("1. In Family 20001,how many women have risk of getting a heart disease(CHD risk score > 10)? What is the ratio?");
                System.out.println("    There are " + getWomenHaveRiskFam() + " males in the family have risk.");
                String femaleHaveRiskRatio3 = String.format("%.2f", ((double) getWomenHaveRiskFam()) / getWomenNumFam());
                System.out.println("    The ratio is: " + femaleHaveRiskRatio3);

                System.out.println("3. What is the ratio of people who have the risk of getting a heart disease?");
                String peopleHaveRiskRatio3 = String.format("%.2f", ((double) getMenHaveRiskFam() + (double) getWomenHaveRiskFam()) / (getMenNumFam() + getWomenNumFam()));
                System.out.println("    The ratio is: " + peopleHaveRiskRatio3);
                break;

            case 6:
                System.out.println("****************************************PERSON LEVEL REPORTS****************************************");
                System.out.println("1. For person 10001,what is his/her CHD risk score?");
                int score1 = getPersonOneScore();
                System.out.println("    Person 10001's risk is: " + score1 + "%");

                System.out.println("1. For person 10010,what is his/her CHD risk score?");
                int score2 = getPersonTwoScore();
                System.out.println("    Person 10010's risk is: " + score2 + "%");

                System.out.println("1. For person 10100,what is his/her CHD risk score?");
                int score3 = getPersonThreeScore();
                System.out.println("    Person 10100's risk is: " + score3 + "%");
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
                        if (resultScore > 10) {
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
                            averTotalC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalTotalC / 5));
                            averHDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalHDLC / 5));
                            averLDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalLDLC / 5));
                            averSysBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalSysBP / 5));
                            averDiaBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalDiaBP / 5));
                            int resultScore = generateData.riskCalculate("female", age, averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, smoke, diabetes);
                            if (resultScore > 16) {
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
        }
        return countWomen;
    }

    private int getMenNumCom() {
        int count = 0;
        for (Community community : city.getCommunityCatalog()) {
            if (community.getCommunityID() == 40001) {
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
        }
        return count;
    }

    private int getWomenNumCom() {
        int count = 0;
        for (Community community : city.getCommunityCatalog()) {
            if (community.getCommunityID() == 40001) {
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

        }

        return count;
    }

    private int getMenHaveRiskCom() {
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
            if (community.getCommunityID() == 40001) {
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
                                averTotalC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalTotalC / 5));
                                averHDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalHDLC / 5));
                                averLDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalLDLC / 5));
                                averSysBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalSysBP / 5));
                                averDiaBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalDiaBP / 5));
                                int resultScore = generateData.riskCalculate("male", age, averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, smoke, diabetes);
                                if (resultScore > 10) {
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
            }
        }
        return countMen;
    }

    private int getWomenHaveRiskCom() {
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
            if (community.getCommunityID() == 40001) {
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
                                averTotalC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalTotalC / 5));
                                averHDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalHDLC / 5));
                                averLDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalLDLC / 5));
                                averSysBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalSysBP / 5));
                                averDiaBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalDiaBP / 5));
                                int resultScore = generateData.riskCalculate("female", age, averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, smoke, diabetes);
                                if (resultScore > 16) {
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
            }
        }
        return countWomen;
    }

    private int getMenNumHou() {
        int count = 0;
        for (Community community : city.getCommunityCatalog()) {
            for (House house : community.getHouseCatalog()) {
                if (house.getHouseID() == 30001) {
                    for (Family family : house.getFamilyCatalog()) {
                        for (Person p : family.getPersonCatalog()) {
                            if (p.getGender().equals("male")) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    private int getWomenNumHou() {
        int count = 0;
        for (Community community : city.getCommunityCatalog()) {
            for (House house : community.getHouseCatalog()) {
                if (house.getHouseID() == 30001) {
                    for (Family family : house.getFamilyCatalog()) {
                        for (Person p : family.getPersonCatalog()) {
                            if (p.getGender().equals("female")) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    private int getMenHaveRiskHou() {
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
                if (house.getHouseID() == 30001) {
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
                                averTotalC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalTotalC / 5));
                                averHDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalHDLC / 5));
                                averLDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalLDLC / 5));
                                averSysBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalSysBP / 5));
                                averDiaBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalDiaBP / 5));
                                int resultScore = generateData.riskCalculate("male", age, averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, smoke, diabetes);
                                if (resultScore > 10) {
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
            }
        }
        return countMen;
    }

    private int getWomenHaveRiskHou() {
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
                if (house.getHouseID() == 30001) {
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
                                averTotalC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalTotalC / 5));
                                averHDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalHDLC / 5));
                                averLDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalLDLC / 5));
                                averSysBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalSysBP / 5));
                                averDiaBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalDiaBP / 5));
                                int resultScore = generateData.riskCalculate("female", age, averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, smoke, diabetes);
                                if (resultScore > 10) {
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
            }
        }
        return countMen;
    }

    private int getMenNumFam() {
        int count = 0;
        for (Community community : city.getCommunityCatalog()) {
            for (House house : community.getHouseCatalog()) {
                for (Family family : house.getFamilyCatalog()) {
                    if (family.getFamilyID() == 20001) {
                        for (Person p : family.getPersonCatalog()) {
                            if (p.getGender().equals("male")) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    private int getWomenNumFam() {
        int count = 0;
        for (Community community : city.getCommunityCatalog()) {
            for (House house : community.getHouseCatalog()) {
                for (Family family : house.getFamilyCatalog()) {
                    if (family.getFamilyID() == 20001) {
                        for (Person p : family.getPersonCatalog()) {
                            if (p.getGender().equals("female")) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    private int getMenHaveRiskFam() {
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
                    if (family.getFamilyID() == 20001) {
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
                                averTotalC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalTotalC / 5));
                                averHDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalHDLC / 5));
                                averLDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalLDLC / 5));
                                averSysBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalSysBP / 5));
                                averDiaBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalDiaBP / 5));
                                int resultScore = generateData.riskCalculate("male", age, averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, smoke, diabetes);
                                if (resultScore > 10) {
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
            }
        }

        return countMen;
    }

    private int getWomenHaveRiskFam() {
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
                    if (family.getFamilyID() == 20001) {
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
                                averTotalC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalTotalC / 5));
                                averHDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalHDLC / 5));
                                averLDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalLDLC / 5));
                                averSysBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalSysBP / 5));
                                averDiaBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalDiaBP / 5));
                                int resultScore = generateData.riskCalculate("female", age, averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, smoke, diabetes);
                                if (resultScore > 10) {
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
            }

        }
        return countMen;
    }

    private int getPersonOneScore() {
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
        int personthreescore = 0;

        for (Community community : city.getCommunityCatalog()) {
            for (House house : community.getHouseCatalog()) {

                for (Family family : house.getFamilyCatalog()) {
                    for (Person p : family.getPersonCatalog()) {
                        if (p.getPersonID() == 10001) {
                            age = p.getAge();
                            gender = p.getGender();
                            smoke = p.getSmoker();
                            diabetes = p.getDiabetes();

                            for (VitalSign vs : p.getVitalSignCatalog().getVitalSignCatalog()) {

                                totalTotalC = totalTotalC + vs.getTotalCholesterol();
                                totalHDLC = totalHDLC + vs.getHDLCholesterol();
                                totalLDLC = totalLDLC + vs.getLDLCholesterol();
                                totalSysBP = totalSysBP + vs.getSystolic();
                                totalDiaBP = totalDiaBP + vs.getDiastolic();
                            }
                            averTotalC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalTotalC / 5));
                            averHDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalHDLC / 5));
                            averLDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalLDLC / 5));
                            averSysBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalSysBP / 5));
                            averDiaBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalDiaBP / 5));
                            int resultScore = generateData.riskCalculate(gender, age, averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, smoke, diabetes);
                            personthreescore = resultScore;
                            totalTotalC = 0;
                            totalHDLC = 0;
                            totalLDLC = 0;
                            totalSysBP = 0;
                            totalDiaBP = 0;
                        }
                    }
                }

            }

        }
        return personthreescore;
    }

    private int getPersonTwoScore() {
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
        int personthreescore = 0;

        for (Community community : city.getCommunityCatalog()) {
            for (House house : community.getHouseCatalog()) {

                for (Family family : house.getFamilyCatalog()) {
                    for (Person p : family.getPersonCatalog()) {
                        if (p.getPersonID() == 10010) {
                            age = p.getAge();
                            gender = p.getGender();
                            smoke = p.getSmoker();
                            diabetes = p.getDiabetes();

                            for (VitalSign vs : p.getVitalSignCatalog().getVitalSignCatalog()) {

                                totalTotalC = totalTotalC + vs.getTotalCholesterol();
                                totalHDLC = totalHDLC + vs.getHDLCholesterol();
                                totalLDLC = totalLDLC + vs.getLDLCholesterol();
                                totalSysBP = totalSysBP + vs.getSystolic();
                                totalDiaBP = totalDiaBP + vs.getDiastolic();
                            }
                            averTotalC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalTotalC / 5));
                            averHDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalHDLC / 5));
                            averLDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalLDLC / 5));
                            averSysBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalSysBP / 5));
                            averDiaBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalDiaBP / 5));
                            int resultScore = generateData.riskCalculate(gender, age, averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, smoke, diabetes);
                            personthreescore = resultScore;
                            totalTotalC = 0;
                            totalHDLC = 0;
                            totalLDLC = 0;
                            totalSysBP = 0;
                            totalDiaBP = 0;
                        }
                    }
                }

            }

        }
        return personthreescore;
    }

    private int getPersonThreeScore() {
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
        int personthreescore = 0;

        for (Community community : city.getCommunityCatalog()) {
            for (House house : community.getHouseCatalog()) {

                for (Family family : house.getFamilyCatalog()) {
                    for (Person p : family.getPersonCatalog()) {
                        if (p.getPersonID() == 10100) {
                            age = p.getAge();
                            gender = p.getGender();
                            smoke = p.getSmoker();
                            diabetes = p.getDiabetes();

                            for (VitalSign vs : p.getVitalSignCatalog().getVitalSignCatalog()) {

                                totalTotalC = totalTotalC + vs.getTotalCholesterol();
                                totalHDLC = totalHDLC + vs.getHDLCholesterol();
                                totalLDLC = totalLDLC + vs.getLDLCholesterol();
                                totalSysBP = totalSysBP + vs.getSystolic();
                                totalDiaBP = totalDiaBP + vs.getDiastolic();

                            }
                            averTotalC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalTotalC / 5));
                            averHDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalHDLC / 5));
                            averLDLC = Integer.parseInt(new java.text.DecimalFormat("0").format(totalLDLC / 5));
                            averSysBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalSysBP / 5));
                            averDiaBP = Integer.parseInt(new java.text.DecimalFormat("0").format(totalDiaBP / 5));
                            int resultScore = generateData.riskCalculate(gender, age, averTotalC, averHDLC, averLDLC, averSysBP, averDiaBP, smoke, diabetes);
                            personthreescore = resultScore;
                            totalTotalC = 0;
                            totalHDLC = 0;
                            totalLDLC = 0;
                            totalSysBP = 0;
                            totalDiaBP = 0;
                        }
                    }
                }

            }

        }
        return personthreescore;
    }

}
