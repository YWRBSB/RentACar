/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.HashMap;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author Yuri
 * 
 * No idea about doing it.
 */
public class Car implements CarInterface{

    @Override
    public Map<Month, boolean[]> createAvailability() {
   
        Map<Month, boolean[]> availability = new HashMap<>();
     
        this.getAvailability();
        
        return availability;
    
     
    }

    @Override
    public Make getMake() {
        
       this.getMake();
        return null;
       
               
    }

    @Override
    public void setMake(Make make) {
       this.setMake(make);
       
       
    }

    @Override
    public double getRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRate(double rate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
