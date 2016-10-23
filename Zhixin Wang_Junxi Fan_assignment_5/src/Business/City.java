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
public class City {
    private ArrayList<Community> communityCatalog;


    public City(){
        communityCatalog = new ArrayList<Community>();

    }



    public ArrayList<Community> getCommunityCatalog() {
        return communityCatalog;
    }


    public Community addCommunity(){
        Community community = new Community();
        communityCatalog.add(community);
        return community;
    }
    
}
