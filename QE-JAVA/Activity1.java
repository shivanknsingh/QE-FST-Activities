package com.example;


class Car{
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car(int tyres,int doors){
        this.tyres=tyres;
        this.doors=doors;
    }
    void displayCharecterstics(){
        System.out.println(color+" "+tyres+" "+doors+" "+make+" "+transmission);
    }
    void accelerates(){
        System.out.println("Car is moving forward");
    }
    void brake(){
        System.out.println("Car has Stopped");
    }
}
public class Activity1 {
    public static void main(String[] args) {
        Car defender=new Car(4,4); 
        defender.make=2014;
        defender.color="black";
        defender.transmission="manual";
        defender.accelerates();
        defender.brake();
    }
}
