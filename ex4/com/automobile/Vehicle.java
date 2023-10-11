package com.automobile;
import java.util.Scanner;

public abstract class Vehicle{
    Scanner scan = new Scanner(System.in);
    public String modelname = "";
    public String registrationnumber = "";
    public String ownername = "";
    
    public String getModelName(){
        System.out.println("Enter model name:");
        modelname = scan.nextLine();
        return modelname;
    }
   
    public String getRegistrationNumber(){
          System.out.println("Enter registration number:");
        registrationnumber = scan.nextLine();
        return registrationnumber;  
    } 

    public String getOwnerName(){
        System.out.println("Enter owner name:");
        ownername = scan.nextLine();
        return ownername; 
    } 

}
