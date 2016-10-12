/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DepartmentRole;


import java.util.ArrayList;

/**
 *
 * @author fjx19
 */
public class SeatCatalog {
    private ArrayList<Seat> seatCatalog;
    
    public SeatCatalog(){
        seatCatalog = new ArrayList<Seat>();
    }

    public ArrayList<Seat> getSeatCatalog() {
        return seatCatalog;
    }
    public Seat addSeat(){
        Seat seat = new Seat();
        seatCatalog.add(seat);
        return seat;
    }
}
