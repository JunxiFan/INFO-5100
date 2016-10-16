/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DepartmentRole;

/**
 *
 * @author fjx19
 */
public class Seat {
    private String semesterName;
    private String courseOfferingID;
    private int seatNum;
    private static int count = 0;
    
    public Seat(){
        count++;
        seatNum = count;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public String getCourseOfferingID() {
        return courseOfferingID;
    }

    public void setCourseOfferingID(String courseOfferingID) {
        this.courseOfferingID = courseOfferingID;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Seat.count = count;
    }
    
    
}
