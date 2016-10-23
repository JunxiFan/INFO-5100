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
public class VitalSignCatalog {
     private ArrayList<VitalSign> vitalSignCatalog;
    
    public VitalSignCatalog(){
        vitalSignCatalog = new ArrayList<VitalSign>();
    }

    public ArrayList<VitalSign> getVitalSignCatalog() {
        return vitalSignCatalog;
    }
    
    public VitalSign addVitalSign(){
        VitalSign vitalSign = new VitalSign();
        vitalSignCatalog.add(vitalSign);
        return vitalSign;
    }
}
