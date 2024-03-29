/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner.Flight;

import Business.Airliner.Flight.Flight;
import Business.Airliner.Airliner;
import java.util.ArrayList;

/**
 *
 * @author 25434
 */

public class FlightSchedual {

    private ArrayList<Flight> flightList;
    private Airliner airliner;

    public FlightSchedual(Airliner airliner){
        this.flightList = new ArrayList<>();
        this.airliner = airliner;
    }

    public ArrayList<Flight> getFlghtList() {
        return flightList;
    }

    public void setFlghtList(ArrayList<Flight> flghtList) {
        this.flightList = flghtList;
    }
    
    public Flight addFlight(){
        Flight newFlight = new Flight(this.airliner);
        flightList.add(newFlight);
        return newFlight;
    }
    
    public void deleteFlight(Flight flight){
        flightList.remove(flight);
    }
 
}
