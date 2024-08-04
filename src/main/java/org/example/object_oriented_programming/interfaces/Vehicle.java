package org.example.object_oriented_programming.interfaces;

//if we implement an interface we have two options either to implement those functions which are defined inside interface, here
// or, declare this class as abstract
public abstract class Vehicle implements VehicleInterface {

    public int getMaxSpeed() {
        return 10;
    }

    @Override
    public void print() {

    }
}


