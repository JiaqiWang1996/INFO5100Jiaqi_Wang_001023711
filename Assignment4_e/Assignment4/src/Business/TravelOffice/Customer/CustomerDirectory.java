/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelOffice.Customer;

import Business.TravelOffice.TravelOffice;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author 25434
 */
public class CustomerDirectory {
    Customer customer;
    List<Customer> customerList;
    String officeInfo;
    
    public CustomerDirectory(TravelOffice travelOffice){
        this.officeInfo = travelOffice.getName();
        customerList = new ArrayList<>();
    }
    
    public List<Customer> getCustomerList(){
        return customerList;
    }
    
    public int getCustomerNum(){
        return customerList.size();
    }
}
