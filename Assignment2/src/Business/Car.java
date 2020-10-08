/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author User
 */
public class Car {
    private Date createdOn;
    private int Availability;//use 0/1 to display the availability status of car
    private String Manufacturer;
    private int Production_Year;
    private int Capacity;
    private String Serial_Number;
    private String Model_Number;
    private String City;
    private int Maintenance_Validation;//use 0/1 to display the certificate status of car

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getAvailability() {
        return Availability;
    }

    public void setAvailability(int Availability) {
        this.Availability = Availability;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public int getProduction_Year() {
        return Production_Year;
    }

    public void setProduction_Year(int Production_Year) {
        this.Production_Year = Production_Year;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public String getSerial_Number() {
        return Serial_Number;
    }

    public void setSerial_Number(String Serial_Number) {
        this.Serial_Number = Serial_Number;
    }

    public String getModel_Number() {
        return Model_Number;
    }

    public void setModel_Number(String Model_Number) {
        this.Model_Number = Model_Number;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public int getMaintenance_Validation() {
        return Maintenance_Validation;
    }

    public void setMaintenance_Validation(int Maintenance_Validation) {
        this.Maintenance_Validation = Maintenance_Validation;
    }
    
    
    
    
    
    
    
    
    
    public Car(){
        this.createdOn =new Date();
       
        
    }//default constructor,whenever creating an obj of the class,the constructor is called
    
     public String toString(){
        return this.Manufacturer;
    }
}
 
