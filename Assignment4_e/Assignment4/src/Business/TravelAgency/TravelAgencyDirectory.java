
package Business.TravelAgency;

import java.util.ArrayList;

/**
 *
 * @author 25434
 */
public class TravelAgencyDirectory {
    
    private ArrayList<TravelAgency> travelAgencyList;
    
    public TravelAgencyDirectory(){
        travelAgencyList = new ArrayList<>();
    }
    
    public ArrayList<TravelAgency> getTavelAgencyList(){
        return travelAgencyList;
    }

}
