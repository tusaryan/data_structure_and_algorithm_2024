package org.example.object_oriented_programming.vehicle;

//public abstract class Car extends Vehicle {
//or
public abstract class Car extends Vehicle {
    int numGears;
    boolean isConvertible;

    public Car() {
        super(100);
    }

    public Car(int numGears, int maxSpeed) {
        super(maxSpeed);
        this.numGears = numGears;
        System.out.println("Car Constructor");
    }

    @Override
    public boolean isMotorized() {
        return false;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void printCar() { //polymorphism -> same name as parent class fn name
        super.print();
        System.out.println("Car numGears : " + numGears);
        System.out.println("Car isConvertible : " + isConvertible);
    }
}

