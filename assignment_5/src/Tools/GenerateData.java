/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Business.City;
import Business.Community;
import java.util.Random;

/**
 *
 * @author fjx19
 */
public class GenerateData {

    public GenerateData() {

    }

    public String generateString(Random rng, String characters, int length) {
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }

    public int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public int riskCalculate(String gender, int age, int totalC, int hdlC, int ldlC, int sysBP, int diaBP, String smoke, String diabetes) {
        int ageRisk = 0;
        int totalCRisk = 0;
        int hdlCRisk = 0;
        int ldlCRisk = 0;
        int bpRisk = 0;
        int smokeRisk = 0;
        int diabetesRisk = 0;
        int riskScore = 0;
        int tenYearRisk = 0;
        int result = 0;

        if (gender.equals("male")) {
            if ((age > 29) && (age < 35)) {
                ageRisk = -1;
            } else if ((age > 34) && (age < 40)) {
                ageRisk = 0;
            } else if ((age > 39) && (age < 45)) {
                ageRisk = 1;
            } else if ((age > 44) && (age < 50)) {
                ageRisk = 2;
            } else if ((age) > 49 && (age < 55)) {
                ageRisk = 3;
            } else if ((age > 54) && (age < 60)) {
                ageRisk = 4;
            } else if ((age > 59) && (age < 65)) {
                ageRisk = 5;
            } else if ((age > 64) && (age < 70)) {
                ageRisk = 6;
            } else if ((age > 69) && (age < 75)) {
                ageRisk = 7;
            }

            if (totalC < 160) {
                totalCRisk = -3;
            } else if ((totalC > 159) && (totalC < 200)) {
                totalCRisk = 0;
            } else if ((totalC > 199) && (totalC < 240)) {
                totalCRisk = 1;
            } else if ((totalC > 239) && (totalC < 280)) {
                totalCRisk = 2;
            } else if (totalC > 279) {
                totalCRisk = 3;
            }

            if (hdlC < 35) {
                hdlCRisk = 2;
            } else if ((hdlC > 34) && (hdlC < 45)) {
                hdlCRisk = 1;
            } else if ((hdlC > 44) && (hdlC < 60)) {
                hdlCRisk = 0;
            } else if (hdlC > 59) {
                hdlCRisk = -1;
            }

            if (ldlC < 100) {
                ldlCRisk = -3;
            } else if ((ldlC > 99) && ldlC < 160) {
                ldlCRisk = 0;
            } else if ((ldlC > 159) && ldlC < 190) {
                ldlCRisk = 1;
            } else if (ldlC > 189) {
                ldlCRisk = 2;
            }

            if (sysBP < 130) {
                if (diaBP < 85) {
                    bpRisk = 0;
                } else if ((diaBP > 84) && (diaBP < 90)) {
                    bpRisk = 1;
                } else if ((diaBP > 89) && (diaBP < 100)) {
                    bpRisk = 2;
                } else if (diaBP > 99) {
                    bpRisk = 3;
                }
            } else if ((sysBP > 129) && (sysBP < 140)) {
                if (diaBP < 85) {
                    bpRisk = 1;
                } else if ((diaBP > 84) && (diaBP < 90)) {
                    bpRisk = 1;
                } else if ((diaBP > 89) && (diaBP < 100)) {
                    bpRisk = 2;
                } else if (diaBP > 99) {
                    bpRisk = 3;
                }
            } else if ((sysBP > 139) && (sysBP < 160)) {
                if (diaBP < 85) {
                    bpRisk = 2;
                } else if ((diaBP > 84) && (diaBP < 90)) {
                    bpRisk = 2;
                } else if ((diaBP > 89) && (diaBP < 100)) {
                    bpRisk = 2;
                } else if (diaBP > 99) {
                    bpRisk = 3;
                }
            } else if (sysBP > 159) {
                if (diaBP < 85) {
                    bpRisk = 3;
                } else if ((diaBP > 84) && (diaBP < 90)) {
                    bpRisk = 3;
                } else if ((diaBP > 89) && (diaBP < 100)) {
                    bpRisk = 3;
                } else if (diaBP > 99) {
                    bpRisk = 3;
                }
            }

            if (smoke.equals("Yes")) {
                smokeRisk = 2;
            } else {
                smokeRisk = 0;
            }

            if (diabetes.equals("Yes")) {
                diabetesRisk = 2;
            } else {
                diabetesRisk = 0;
            }

            riskScore = ageRisk + totalCRisk + hdlCRisk + ldlCRisk + bpRisk + smokeRisk + diabetesRisk;
            if (riskScore < -3) {
                tenYearRisk = 1;
            } else if (riskScore == -2) {
                tenYearRisk = 2;
            } else if (riskScore == -1) {
                tenYearRisk = 2;
            } else if (riskScore == 0) {
                tenYearRisk = 3;
            } else if (riskScore == 1) {
                tenYearRisk = 4;
            } else if (riskScore == 2) {
                tenYearRisk = 4;
            } else if (riskScore == 3) {
                tenYearRisk = 6;
            } else if (riskScore == 4) {
                tenYearRisk = 7;
            } else if (riskScore == 5) {
                tenYearRisk = 9;
            } else if (riskScore == 6) {
                tenYearRisk = 11;
            } else if (riskScore == 7) {
                tenYearRisk = 14;
            } else if (riskScore == 8) {
                tenYearRisk = 18;
            } else if (riskScore == 9) {
                tenYearRisk = 22;
            } else if (riskScore == 10) {
                tenYearRisk = 27;
            } else if (riskScore == 11) {
                tenYearRisk = 33;
            } else if (riskScore == 12) {
                tenYearRisk = 40;
            } else if (riskScore == 13) {
                tenYearRisk = 47;
            } else if (riskScore >= 14) {
                tenYearRisk = 56;
            }
           

        } else if (gender.equals("female")) {
            if ((age > 29) && (age < 35)) {
                ageRisk = -9;
            } else if ((age > 34) && (age < 40)) {
                ageRisk = -4;
            } else if ((age > 39) && (age < 45)) {
                ageRisk = 0;
            } else if ((age > 44) && (age < 50)) {
                ageRisk = 3;
            } else if ((age) > 49 && (age < 55)) {
                ageRisk = 6;
            } else if ((age > 54) && (age < 60)) {
                ageRisk = 7;
            } else if ((age > 59) && (age < 65)) {
                ageRisk = 8;
            } else if ((age > 64) && (age < 70)) {
                ageRisk = 8;
            } else if ((age > 69) && (age < 75)) {
                ageRisk = 8;
            }

            if (totalC < 160) {
                totalCRisk = -2;
            } else if ((totalC > 159) && (totalC < 200)) {
                totalCRisk = 0;
            } else if ((totalC > 199) && (totalC < 240)) {
                totalCRisk = 1;
            } else if ((totalC > 239) && (totalC < 280)) {
                totalCRisk = 1;
            } else if (totalC > 279) {
                totalCRisk = 3;
            }

            if (hdlC < 35) {
                hdlCRisk = 5;
            } else if ((hdlC > 34) && (hdlC < 45)) {
                hdlCRisk = 2;
            } else if ((hdlC > 44) && (hdlC < 50)) {
                hdlCRisk = 1;
            } else if ((hdlC > 49) && (hdlC < 60)) {
                hdlCRisk = 0;
            } else if (hdlC > 59) {
                hdlCRisk = -3;
            }

            if (ldlC < 100) {
                ldlCRisk = -2;
            } else if ((ldlC > 99) && ldlC < 160) {
                ldlCRisk = 0;
            } else if ((ldlC > 159) && ldlC < 190) {
                ldlCRisk = 2;
            } else if (ldlC > 189) {
                ldlCRisk = 2;
            }

            if (sysBP < 120) {
                if (diaBP < 80) {
                    bpRisk = -3;
                } else if ((diaBP > 79) && (diaBP < 90)) {
                    bpRisk = 0;
                } else if ((diaBP > 89) && (diaBP < 100)) {
                    bpRisk = 2;
                } else if (diaBP > 99) {
                    bpRisk = 3;
                }
            } else if ((sysBP > 119) && (sysBP < 140)) {
                if (diaBP < 80) {
                    bpRisk = 0;
                } else if ((diaBP > 79) && (diaBP < 90)) {
                    bpRisk = 0;
                } else if ((diaBP > 89) && (diaBP < 100)) {
                    bpRisk = 2;
                } else if (diaBP > 99) {
                    bpRisk = 3;
                }
            } else if ((sysBP > 139) && (sysBP < 160)) {
                if (diaBP < 80) {
                    bpRisk = 2;
                } else if ((diaBP > 79) && (diaBP < 90)) {
                    bpRisk = 2;
                } else if ((diaBP > 89) && (diaBP < 100)) {
                    bpRisk = 2;
                } else if (diaBP > 99) {
                    bpRisk = 3;
                }
            } else if (sysBP > 159) {
                if (diaBP < 80) {
                    bpRisk = 3;
                } else if ((diaBP > 79) && (diaBP < 90)) {
                    bpRisk = 3;
                } else if ((diaBP > 89) && (diaBP < 100)) {
                    bpRisk = 3;
                } else if (diaBP > 99) {
                    bpRisk = 3;
                }
            }

            if (smoke.equals("Yes")) {
                smokeRisk = 2;
            } else {
                smokeRisk = 0;
            }

            if (diabetes.equals("Yes")) {
                diabetesRisk = 2;
            } else {
                diabetesRisk = 0;
            }

            riskScore = ageRisk + totalCRisk + hdlCRisk + ldlCRisk + bpRisk + smokeRisk + diabetesRisk;
            if (riskScore <= -2) {
                tenYearRisk = 1;
            } else if (riskScore == -1) {
                tenYearRisk = 2;
            } else if (riskScore == 0) {
                tenYearRisk = 2;
            } else if (riskScore == 1) {
                tenYearRisk = 2;
            } else if (riskScore == 2) {
                tenYearRisk = 3;
            } else if (riskScore == 3) {
                tenYearRisk = 3;
            } else if (riskScore == 4) {
                tenYearRisk = 4;
            } else if (riskScore == 5) {
                tenYearRisk = 5;
            } else if (riskScore == 6) {
                tenYearRisk = 6;
            } else if (riskScore == 7) {
                tenYearRisk = 7;
            } else if (riskScore == 8) {
                tenYearRisk = 8;
            } else if (riskScore == 9) {
                tenYearRisk = 9;
            } else if (riskScore == 10) {
                tenYearRisk = 11;
            } else if (riskScore == 11) {
                tenYearRisk = 13;
            } else if (riskScore == 12) {
                tenYearRisk = 15;
            } else if (riskScore == 13) {
                tenYearRisk = 17;
            } else if (riskScore == 14) {
                tenYearRisk = 20;
            } else if (riskScore == 15) {
                tenYearRisk = 24;
            } else if (riskScore == 16) {
                tenYearRisk = 27;
            } else if (riskScore >= 17) {
                tenYearRisk = 32;
            }
            
        }
        return tenYearRisk;
    }


}
