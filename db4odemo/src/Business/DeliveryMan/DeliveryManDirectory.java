/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
     
    private ArrayList<DeliveryMan> deliveryMansList;

    public DeliveryManDirectory() {
        deliveryMansList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryMansList() {
        return deliveryMansList;
    }
    
    public DeliveryMan createDeliveryMan(String name){
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan .setName(name);
        deliveryMansList.add(deliveryMan );
        return deliveryMan ;
    }
}
