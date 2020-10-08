/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.event.CaretListener;

/**
 *
 * @author User
 */
public class CarDirectory {
    private ArrayList<Car>carList;
    
     public CarDirectory() {
        
        this.carList=new ArrayList<Car>();//add memory
       
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    public Car addCar(){
    Car car=new Car();
    carList.add(car);
    return car;
    }
public void deleteCar(Car car){
       carList.remove(car);//deleted obj doesnt need to return
}

    public Car searchBySerial_Number(String Serial_Number){
      for(Car car :carList){
      if(car.getSerial_Number().equals(Serial_Number)){
    
          return car;
              }
      }
      return null;
    } 
    }

  
 

