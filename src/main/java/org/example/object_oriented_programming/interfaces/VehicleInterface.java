package org.example.object_oriented_programming.interfaces;

// An interface is basically a Contract, if create an interface -> we mention those things which are required in the contract
// Sometime, we call interface as pure abstract class because every thing is abstract inside it. Nothing is implemented here.
public interface VehicleInterface {

    // we generally do not keep any data member inside interface but
    // if we put any data member inside an interface it should be final and static
    // we only keep data member inside interface to store constant data
    public final static double PI = 3.14;

    public int getMaxSpeed();
    public void print();
}

