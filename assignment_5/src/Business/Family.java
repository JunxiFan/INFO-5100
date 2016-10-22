/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author fjx19
 */
public class Family {
    private int familyID;
    private String lastName;
    private ArrayList<Person> personCatalog;
    private static int count=20000;

    public Family(){
        personCatalog = new ArrayList<Person>();
        count++;
        familyID = count;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public int getFamilyID() {
        return familyID;
    }

    public void setFamilyID(int familyID) {
        this.familyID = familyID;
    }

    public ArrayList<Person> getPersonCatalog() {
        return personCatalog;
    }


    public Person addPerson(){
        Person person = new Person();
        personCatalog.add(person);
        return person;
    }
}
