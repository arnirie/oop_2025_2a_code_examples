package library_activity;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] array = {1,5,7, -3};
//        MyArrays.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}

//create a utility class MyArrays with a static method bubbleSort()
//which takes an array parameter and sorts the array with Bubble Sort algo

class Circle{
    private double radius;

    public Circle(){
        this.radius = 0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){return radius;}

    public double getDiameter(){return radius * 2;}

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    };

    public static double computeArea(double radius){
        return Math.PI * Math.pow(radius, 2);

    }
}

//class Circle, field: radius
//Circle()
//Circle(radius)
//setter/getter radius, getter diameter, getterArea