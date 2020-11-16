/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ticket;

import Business.TravelOffice.TravelOffice;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 25434
 */
public class TicketDirectory {
    
    private List<Ticket> ticketList;
    
    public TicketDirectory(TravelOffice travelOffice){
        this.ticketList = new ArrayList<>();
    }
    
    public List<Ticket> getTicketList(){
        return this.ticketList;
    }

}
