/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.*;
import Tools.GenerateData;
import java.util.Random;

/**
 *
 * @author fjx19
 */
public class Initialize {

    private City city;
    private GenerateData generateData;
    private Random rng;
    private VitalSignCatalog vitalSignCatalog;

    public Initialize(City city) {
        this.city = city;
        generateData = new GenerateData();
        rng = new Random();
        vitalSignCatalog = new VitalSignCatalog();

    }

    public void iniVitalSign(Person person) {
        VitalSign vs = person.getVitalSignCatalog().addVitalSign();
        vs.setTotalCholesterol(generateData.randInt(155, 285));
        vs.setHDLCholesterol(generateData.randInt(34, 61));
        vs.setLDLCholesterol(generateData.randInt(95, 195));
        vs.setSystolic(generateData.randInt(115, 165));
        vs.setDiastolic(generateData.randInt(77, 101));
    }

    public void iniData() {
        for (int i = 0; i < 10; i++) {
            Community community = city.addCommunity();
//            System.out.println(community.getCommunityID());
            for (int j = 0; j < 10; j++) {
                House house = community.addHouse();
//                System.out.println(house.getHouseID());
                for (int k = 0; k < 3; k++) {
                    Family family = house.addFamily();
                    family.setLastName(generateData.generateString(rng, "ABCDEFGHIJKLMN", 2));
//                    System.out.println(family.getFamilyID());
                    for (int l = 0; l < 1; l++) {
                        Person person = family.addPerson();
                        //person.setVitalSignCatalog(vitalSignCatalog);
                        person.setLastName(family.getLastName());
                        person.setFirstName(generateData.generateString(rng, "abcdefghijklmn", 3));
                        int gender = generateData.randInt(0, l);
                        if (gender == 0) {
                            person.setGender("male");
                        } else {
                            person.setGender("female");
                        }
                        int smoke = generateData.randInt(0, 2);
                        if (smoke == 0) {
                            person.setSmoker("Yes");
                        } else {
                            person.setSmoker("No");
                        }
                        int diabetes = generateData.randInt(0, 99);
                        if (diabetes == 0) {
                            person.setDiabetes("Yes");
                        } else {
                            person.setDiabetes("No");
                        }
                        person.setAge(generateData.randInt(30, 40));
                        for (int a = 0; a < 5; a++) {
                            iniVitalSign(person);
                        }

//mother
                        Person mother = family.addPerson();
//                        mother.setVitalSignCatalog(vitalSignCatalog);
                        mother.setLastName(family.getLastName());
                        mother.setFirstName(generateData.generateString(rng, "abcdefghijklmn", 3));
                        mother.setGender("female");
                        int smoke2 = generateData.randInt(0, 2);
                        if (smoke2 == 0) {
                            mother.setSmoker("Yes");
                        } else {
                            mother.setSmoker("No");
                        }
                        int diabetes2 = generateData.randInt(0, 99);
                        if (diabetes2 == 0) {
                            mother.setDiabetes("Yes");
                        } else {
                            mother.setDiabetes("No");
                        }
                        mother.setAge(person.getAge() + generateData.randInt(20, 30));
                        person.setMother(mother);
                        for (int b = 0; b < 5; b++) {
                            iniVitalSign(mother);
                        }
//father
                        Person father = family.addPerson();
//                        father.setVitalSignCatalog(vitalSignCatalog);
                        father.setLastName(family.getLastName());
                        father.setFirstName(generateData.generateString(rng, "abcdefghijklmn", 3));
                        father.setGender("male");
                        int smoke3 = generateData.randInt(0, 2);
                        if (smoke3 == 0) {
                            father.setSmoker("Yes");
                        } else {
                            father.setSmoker("No");
                        }
                        int diabetes3 = generateData.randInt(0, 99);
                        if (diabetes3 == 0) {
                            father.setDiabetes("Yes");
                        } else {
                            father.setDiabetes("No");
                        }
                        father.setAge(person.getAge() + generateData.randInt(20, 30));
                        person.setFather(father);
                        for (int c = 0; c < 5; c++) {
                            iniVitalSign(father);
                        }
//sibling                       
                        Person sibling = family.addPerson();
//                        sibling.setVitalSignCatalog(vitalSignCatalog);
                        sibling.setLastName(family.getLastName());
                        sibling.setFirstName(generateData.generateString(rng, "abcdefghijklmn", 3));
                        int gender4 = generateData.randInt(0, l);
                        if (gender4 == 0) {
                            sibling.setGender("male");
                        } else {
                            sibling.setGender("female");
                        }
                        int smoke4 = generateData.randInt(0, 2);
                        if (smoke4 == 0) {
                            sibling.setSmoker("Yes");
                        } else {
                            sibling.setSmoker("No");
                        }
                        int diabetes4 = generateData.randInt(0, 99);
                        if (diabetes4 == 0) {
                            sibling.setDiabetes("Yes");
                        } else {
                            sibling.setDiabetes("No");
                        }
                        sibling.setAge(generateData.randInt(30, 40));
                        person.addSibling(sibling);
                        for (int d = 0; d < 5; d++) {
                            iniVitalSign(sibling);
                        }
//                
//                        for ( VitalSign vs:person.getVitalSignCatalog().getVitalSignCatalog()) {
//                            if(person.getPersonID()==11197)
//                                System.out.println(vs.getDiastolic());
//                        }
                    }

                }
            }
        }
    }

}
