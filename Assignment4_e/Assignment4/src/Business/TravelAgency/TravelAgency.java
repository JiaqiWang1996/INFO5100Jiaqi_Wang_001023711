/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelAgency;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.MasterTravelSchedule;
import Business.TravelOffice.TravelOffice;
import Business.TravelOffice.TravelOfficeDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

/**
 * @author 25434
 *     
 */
public class TravelAgency {
    
    private UserAccountDirectory userAccountDirectory;
    private AirlinerDirectory airlinerDirectory;
    private TravelOfficeDirectory travelOfficeDirectory;
    private MasterTravelSchedule masterTS;
    
    public TravelAgency(){
        this.userAccountDirectory = new UserAccountDirectory();
        this.airlinerDirectory = new AirlinerDirectory();
        this.travelOfficeDirectory = new TravelOfficeDirectory(this);
        masterTS = MasterTravelSchedule.getInstance();
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public TravelOfficeDirectory getTravelOfficeDirectory() {
        return travelOfficeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    

    public Airliner addAirliner(String name,String userAccountName, String userAccountPassword){
        Airliner airliner = airlinerDirectory.createAirliner(name);
        
        UserAccount ua = userAccountDirectory.createUserAccount(userAccountName, userAccountPassword, "Airliner");
        ua.setMember(airliner);
        
        masterTS.addAirliner(airliner);
        
        return airliner;
    }

    public Airliner removeAirliner(Airliner airliner){
        Airliner deletedAirliner = null;
        if(airlinerDirectory.removeAirliner(airliner)
                &&masterTS.removeAirliner(airliner)
                &&userAccountDirectory.deleteAirlinerUserAccount(airliner)){
            deletedAirliner = airliner;
        }else{
            System.err.println("removeAirliner: can't remove, it seems can't find this airliner in airlinerDir/masterTS/userAccountDir");
        }
        
        return deletedAirliner;
    }

    public TravelOffice addTravelOffice(String name, String userAccountName, String userAccountPassword){
        TravelOffice to = travelOfficeDirectory.createTravelOffice();
        to.setName(name);
        
        UserAccount ua = userAccountDirectory.createUserAccount(userAccountName, userAccountPassword, "TravelOffice");
        ua.setMember(to);
        
        return to;
    }

    public TravelOffice removeTravelOffice(TravelOffice to){
        TravelOffice deletedTO = null;
         if(travelOfficeDirectory.removeTravelOffice(to)
                &&userAccountDirectory.deleteTravelOfficeUserAccount(to)){
            deletedTO = to;
        }else{
            System.err.println("removeTravelOffice: can't remove, it seems can't find this travel office in travelOfficeDir/userAccountDir");
        }
        
        return deletedTO;
    }
    

    public boolean isAirlinerNameDuplicated(String name){
        boolean isDuplicate = false;
        for(Airliner airliner : airlinerDirectory.getAirlinerList()){
            if(airliner.getName().equals(name)){
                isDuplicate = true;
            }
        }
        return isDuplicate;
    }
    
    public boolean isUserNameDuplicated(String username){
        boolean isDuplicate = false;
        for(UserAccount userAccount : userAccountDirectory.getUserAccountList()){
            if(userAccount.getUsername().equals(username)){
                isDuplicate = true;
            }
        }
        return isDuplicate;
    }
    
    public boolean isTravelOfficeNameDuplicated(String name){
        boolean isDuplicate = false;
        for(TravelOffice to : travelOfficeDirectory.getTravelOfficList()){
            if(to.getName().equals(name)){
                isDuplicate = true;
            }
        }
        return isDuplicate;
    }

}
