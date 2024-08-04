package org.example.object_oriented_programming.vehicle;

import org.example.object_oriented_programming.generics.PrintInterface;

// using "final" keyword in a class means other class cannot inherit from it
// We cannot subclass this class
//public final class Vehicle {
// since vehicle is an abstract / incomplete class. So, we cannot create an object of abstract class using "new" keyword.
// since we have an abstract / incomplete function. So, ultimately our class is also incomplete now, so we have to define our class as abstract.
//Subclass also have two option either implement/define that incomplete function and make itself complete or to make itself abstract
public abstract class Vehicle implements PrintInterface {
    protected String color;
    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
//        System.out.println("Vehicle Constructor");
    }

    //    public Vehicle() {
//        System.out.println("Vehicle Constructor");
//    }
    // using "final" keyword in any function means child class/any subclass cannot make this exact same signature function i.e. can't override parent class function
    public final void print() {
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle Speed: " + maxSpeed);
    }

    // wrt function - Abstract is used To define a function whose body/logic can only be answered by its subclass and cannot be defined in parent
    // and if we do not use abstract it will be optional for its subclasses to define it or not. yeh unki marzi hogi.
    // but whose ans or function should compulsorily be defined inside its subclass so to force them to define this we use abstract keyword
    // for this we have to make that function as well as that parent class as abstract

    public abstract boolean isMotorized();

    public abstract String getCompany();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int speed) {
        maxSpeed = speed;
    }
}
