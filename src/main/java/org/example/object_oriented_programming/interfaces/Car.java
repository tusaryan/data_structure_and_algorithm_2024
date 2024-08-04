package org.example.object_oriented_programming.interfaces;

// In Java, we can extend only one class, but in C++ we can extend multiple class i.e. multiple inheritance allowed
// but, we can implement multiple interface
public class Car extends Vehicle implements CarInterface {

    @Override
    public void print() {
        super.print();
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public String getCompany() {
        return "";
    }
}
