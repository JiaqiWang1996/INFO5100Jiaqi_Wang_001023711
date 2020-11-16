/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner.Flight;

import Business.TravelOffice.Customer.Customer;


public class Seat {

    private String seatType;
    private int row;
    private int colum;
    private boolean assigned;
    private boolean reserved;
    private Customer customer;
    
    public enum seatType{
        Window,Middle,Asile;
    }
    
    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
}
