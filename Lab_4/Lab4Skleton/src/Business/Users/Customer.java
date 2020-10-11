/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.CustomerDirectory;

import java.nio.file.DirectoryStream;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Customer>{
  private  CustomerDirectory directory;
    public Customer(String password, String userName) {
        super(password, userName,"Customer");
        directory =new CustomerDirectory();
    }

    @Override
    public boolean verify(String password) {
        //To change body of generated methods, choose Tools | Templates.
         if(password.equals(getPassword()))
            return true;
        return false;
    }

    public CustomerDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(CustomerDirectory directory) {
        this.directory = directory;
    }

   

    @Override
    public int compareTo(Customer t) {
       //To change body of generated methods, choose Tools | Templates.
       return t.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
       return getUserName();
    }
    
}
