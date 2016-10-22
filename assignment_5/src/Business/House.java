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
public class House {

    private int houseID;
    private ArrayList<Family> familyCatalog;
    private static int count = 30000;

    public House() {
        count++;
        houseID = count;
        familyCatalog = new ArrayList<Family>();
    }

    public int getHouseID() {
        return houseID;
    }

    public void setHouseID(int houseID) {
        this.houseID = houseID;
    }

    public ArrayList<Family> getFamilyCatalog() {
        return familyCatalog;
    }

    public Family addFamily(){
        Family family = new Family();
        familyCatalog.add(family);
        return family;
    }
}
