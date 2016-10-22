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
public class Person {

    private int personID;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String smoker;
    private String diabetes;

    private Person mother;
    private Person father;
    private ArrayList<Person> siblings;
    private VitalSignCatalog vitalSignCatalog;

    private static int count = 10000;

    public Person() {
        count++;
        personID = count;
        siblings = new ArrayList<Person>();
        vitalSignCatalog = new VitalSignCatalog();
    }

    public String getGender() {
        return gender;
    }

    public String getSmoker() {
        return smoker;
    }

    public void setSmoker(String smoker) {
        this.smoker = smoker;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public VitalSignCatalog getVitalSignCatalog() {
        return vitalSignCatalog;
    }

    public void setVitalSignCatalog(VitalSignCatalog vitalSignCatalog) {
        this.vitalSignCatalog = vitalSignCatalog;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void addSibling(Person sibling) {
        siblings.add(sibling);

    }

    @Override
    public String toString(){
        return firstName;
    }
}
