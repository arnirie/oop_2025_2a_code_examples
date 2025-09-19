//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }
}

class Count{
    static int count = 0;
    int instanceCount = 0;

    Count(){
        count++;
        instanceCount++;
    }

    public static int getCount(){ return count; }

    public int getInstanceCount(){ return instanceCount; }
}

/*
Create a class Bicycle with the following fields and methods
-wheels
-gear
-speed
-price

Bicycle()
Bicycle(gear, speed)
Bicycle(wheels, gear, speed, price)
getter & setter for each field
speedUp(addSpeed)
speedDown(decSpeed)
gearUp()
gearDown()
printInfo() - prints all the fields via sout
 */

class Vehicle {
    static int count;
    private int gear;
    int numSeats;
    int speed;
    float gasLiters;
    String name;

    //constructor
    Vehicle(){
        count++;
        gear = 0;
        numSeats = 0;
        speed = 0;
        gasLiters = 50;
    }

    Vehicle(int gear){
        count++;
        this.gear = gear;
        numSeats = 0;
        speed = 0;
        gasLiters = 50;
    }

    Vehicle(int gear, int numSeats, int speed, float gasLiters){
        count++;
        this.gear = gear;
        this.numSeats = numSeats;
        this.speed = speed;
        this.gasLiters = gasLiters;
    }

    static void countCreatedObjects(){
        System.out.println(count);
    }

    public void setGear(int gear){
        if(gear < 0){
            //throw an exception
            System.out.println("Cannot set to a negative value");
            return;
        }
        this.gear = gear;
    }

    public int getGear(){
        return this.gear;
    }

    //accelerate based on a given value
    void speedUp(int addSpeed){
        speed += addSpeed;
    }

    //dec
    void speedDown(int decSpeed){
        speed -=decSpeed;
    }
}