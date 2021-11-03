/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Yuri
 * 
 * No idea about doing it
 */
public class BookingSystem implements BookingSystemInterface {

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
       
         RentACarInterface rentacar  = new RentACar();
         in.readLine();
         String text= in.readLine();
         String[] carSplit;
         
         while (text != null){
             
             carSplit = text.split(":");
             rentACar = new rentACar (carSplit[0], Integer.parseInt(carSplit[1]), Integer.parseInt(carSplit[2]));
             rentacar.getCars();
             text = in.readLine();
                     
         }
         
         return rentACar;
         
         
    }
    
}
