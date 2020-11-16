/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelOffice.Customer;

import Business.Ticket.Ticket;
import Business.TravelOffice.TravelOffice;

/**
 *
 * @author 25434
 */
public class Customer {

    private Ticket ticket;
    
    private String id;
    private static int count = 0;
    private String name;
    private String identityType;
    private String identityID;
    private String officeInfo;
    private boolean gotTicket = false;

    
    public Customer(TravelOffice travelOffice){
        this.id = travelOffice.getId() + Integer.toString(count++);
        this.officeInfo = travelOffice.getName();
        
        System.out.println("New customer");
        System.out.println(officeInfo);
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityID() {
        return identityID;
    }

    public void setIdentityID(String identityID) {
        this.identityID = identityID;
    }
    
    
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getId() {
        return id;
    }

    public String getOfficeInfo() {
        return officeInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("SetName");
    }
    
    public boolean isGotTicket(){
        return gotTicket;
    }
    
    public void gotTicket(){
        gotTicket = true;
    }
    
    public void notGotTicket(){
        gotTicket = false;
    }
    
    @Override
    public String toString(){
        return name;
    }

}
