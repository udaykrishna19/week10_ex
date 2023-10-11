package com.automobile.twowheeler;
import com.automobile.Vehicle;
import java.util.Scanner;

public class Hero extends Vehicle{
    Scanner scan = new Scanner(System.in);
    public int speed;
    public int getSpeed(){
        System.out.println("Enter speed:");
        speed = scan.nextInt();
        return speed;
    } 

    public void radio(){
        System.out.println("providing facility to control the radio device");
    } 
}
