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
public class University {
    private String universityName;
    private String address;
    private CollegeCatalog collegecatalog;
    private UniversityStudentCatalog universityStudentCatalog;
    
    public University(){
        collegecatalog = new CollegeCatalog();
        universityStudentCatalog = new UniversityStudentCatalog();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CollegeCatalog getCollegecatalog() {
        return collegecatalog;
    }

    public UniversityStudentCatalog getUniversityStudentCatalog() {
        return universityStudentCatalog;
    }
    
    



    



}
