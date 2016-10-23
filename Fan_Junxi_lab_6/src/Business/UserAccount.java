/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author fjx19
 */
public class UserAccount {

    public static String ADMIN_ROLE = "admin";
    public static String EEPLOYEE_ROLE = "employee";
    private static int count = 1000;
    private int userID;
    private String userName;
    private String password;
    private String rle;
    private boolean isActive;
    private Person person;

    public UserAccount() {
        userID = count++;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRle() {
        return rle;
    }

    public void setRle(String rle) {
        this.rle = rle;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    @Override
    public String toString(){
        return person.getFirstName()+" "+person.getLastName();
    }
    

}
