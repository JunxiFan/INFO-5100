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
public class CollegeCatalog {
    private ArrayList<College> collegeCatalog;
    
    public CollegeCatalog(){
        collegeCatalog = new ArrayList<College>();
    }

    public ArrayList<College> getCollegeCatalog() {
        return collegeCatalog;
    }

    public void setCollegeCatalog(ArrayList<College> collegeCatalog) {
        this.collegeCatalog = collegeCatalog;
    }
    
    public College addCollege(){
        College college = new College();
        collegeCatalog.add(college);
        return college;
    }
    
    
}
