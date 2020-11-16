
package Business;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.Airliner.Flight.Flight;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author 25434
 */
public class MasterTravelSchedule {
    
    private static MasterTravelSchedule masterTS;
    private AirlinerDirectory airlinerDir;

    public static MasterTravelSchedule getInstance(){
        if(masterTS == null){
            masterTS = new MasterTravelSchedule();
        }
        return masterTS;
    }
    private MasterTravelSchedule(){
        airlinerDir = new AirlinerDirectory();
    }
    
    public void setAirlinerDirectory(AirlinerDirectory airlinerDir){
        this.airlinerDir = airlinerDir;
    }
    
    public void addAirliner(Airliner airliner){
        airlinerDir.addAirliner(airliner);
    }
    
    public boolean removeAirliner(Airliner airliner){
        boolean success = airlinerDir.removeAirliner(airliner);
        return success;
    }

    public List<Flight> searchFlightsByFlightNum(String flightNo){
        List<Flight> searchedFligh = new ArrayList<Flight>();
        List<Flight> allFlights = getAllFlightsOfAirliners();
        for(Flight fl : allFlights){
            if(fl.getFlightNo().equals(flightNo)){
                searchedFligh.add(fl);
                break;
            }
        }
        
        return searchedFligh;
    }
    
    public List<Flight> searchFlightByDeparture(List<Flight> searchList, String departLocation){
        List<Flight> foundedFlights = new ArrayList<Flight>();
        for(Flight fl : searchList){
            if(fl.getDeparture().equals(departLocation)){
                foundedFlights.add(fl);
            }
        }    
        return foundedFlights;
    }
    
    public List<Flight> searchFlightByArrival(List<Flight> searchList, String arriveLocation){
        List<Flight> foundedFlights = new ArrayList<Flight>();
        for(Flight fl : searchList){
            if(fl.getDestination().equals(arriveLocation)){
                foundedFlights.add(fl);
            }
        }    
        return foundedFlights;
    }
    

    public List<Flight> searchFlightByTimeRange(List<Flight> searchList, String timeRange){
        List<Flight> foundedFlights = new ArrayList<Flight>();
        for(Flight fl : searchList){
            if(fl.getStartTimeRange().equalsIgnoreCase(timeRange)){
                foundedFlights.add(fl);
            }
        }    
        return foundedFlights;
    }


    public List<Flight> searchFlightByDate(List<Flight> searchList, String date){
        List<Flight> foundedFlights = new ArrayList<Flight>();
        for(Flight fl : searchList){
            if(fl.getDate().equals(date)){
                foundedFlights.add(fl);
            }
        }    
        return foundedFlights;
    }
    

    public List<Flight> getAllFlightsOfAirliners(){
        List<Flight> allFlights = new ArrayList<Flight>();
        for(Airliner al : airlinerDir.getAirlinerList()){
            for(Flight fl : al.getFlightSchedual().getFlghtList())
                allFlights.add(fl);
        }
        
        return allFlights;
    }
    
    
    
}
