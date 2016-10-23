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
public class Community {
    private int communityID;
    private ArrayList<House> houseCatalog;
    private static int count=40000;

    public Community(){
        houseCatalog = new ArrayList<House>();
        count++;
        communityID = count;
    }

    public int getCommunityID() {
        return communityID;
    }

    public void setCommunityID(int communityID) {
        this.communityID = communityID;
    }

    public ArrayList<House> getHouseCatalog() {
        return houseCatalog;
    }


    public House addHouse(){
        House house = new House();
        houseCatalog.add(house);
        return house;
    }
}
