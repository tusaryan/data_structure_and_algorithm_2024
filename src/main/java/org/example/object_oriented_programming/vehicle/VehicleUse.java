package org.example.object_oriented_programming.vehicle;

import java.util.Scanner;

// this code is not modified after doing some changes like creating interface, code changes of used classes inside this class.
public class VehicleUse {
    public static void main(String[] args) {
//        Vehicle v = new Vehicle();
        Vehicle v = new Car(1, 2) {
            @Override
            public String getCompany() {
                return "Rolls-Royce";
            }
        };
//        v.color = "Black";
//        v.setMaxSpeed(10);
//        v.print();


//        ek vehicle type ka reference hai jo ki ek car ko point kar raha hai --> Polymorphism
//        Vehicle v = new Car(10, 20); // it is also a kind of polymorphism
//        compiler actually don't care anything usse abhi yeh pata hai ki v --> is a vehicle so vehicle type cheezein access karne do, baaki cheezein matt access karne do

//        v.print(); //since v is a a type of Vehicle so COMPILE time pe hum ussi ke function call kar sakte hai.
        // ( isConvertible is fn of Car, so we cannot call it or write since it would not be able to compile)
        // Actual function jo call hoga wo RUNTIME pe decide hota hai
        // since "v" is a type = vehicle which is actually assigned as car i.e. it's child
        // Before compilation compiler only knows that v is a type of vehicle but after compilation i.e. during Runtime it will know that is a actually a car, so pehle Car ke andar check hoga if print fn hoga toh wo print karna else vehicle wala print fn call hoga
        //And it is very much logical as well

//        practical example of above it is below :
        //Just think how this can be possible
        //Because compiler ko pata hin nahi hai car banega ya vehicle
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Vehicle v2;
        if (n == 0) {
            v2 = new Car(10, 20) {
                @Override
                public String getCompany() {
                    return "BMW";
                }
            };
        }else {
//            v2 = new Vehicle(20);
        }

//        Car c = new Car(10, 20);
//        c.color = "Black";
//        System.out.println(c.color);
//        c.setMaxSpeed(100);
//        c.print();
    }
}
