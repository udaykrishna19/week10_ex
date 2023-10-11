package com.automobile.twowheeler;
import com.automobile.Vehicle;
import java.util.Scanner;
public class Honda extends Vehicle {
    Scanner scan = new Scanner(System.in);
    public int speed;
    public int getSpeed(){
        System.out.println("Enter speed");
        speed = scan.nextInt();
        return speed;
    }
    public void cdplayer(){
        System.out.println(" provideing facility to control the cd player device which is available in the car");
    }      
}
