package org.example.object_oriented_programming.generics;

import org.example.object_oriented_programming.vehicle.Vehicle;

public class Print {

    // defining your methods to be generic
    /** we can also bound generics to take only those input which satisfy this condition
     * for example Vehicle has a print function ot print it but other class / non-primitive data type may not have print function like Integer.
     * So, we can bound what kind of T will get accepted here
     * T to take only those input which have print function like Vehicle
     * format : <T extends Vehicle>
     * it's not compulsory that wo Vehicle ke direct subclass ho.
     * for example we can pass BMW object because BMW inherit from Car class which inherit from Vehicle class. So, BMW also extends Vehicle class in a way
     * so that we can do this :
     * v[10].print();
     * **/
//    public static<T> void printArray(T[] a) {



    // in Class to use Interface we will use there "implements" and to use/inherit another Class we use "extends".
    // there is a difference in Generics whether it is a class/interface we use "extends" to bound to any of them.
    // so a/c to below code if we take only those T which implement/bound to PrintInterface means unmein print function toh hogi(as interface is just like signing a Contract-->  means yeh toh hona hin hai)
    //Now this is a lot more useful because Student class ke paas bhi agar print fn hai toh usse bass likhna hai implements PrintInterface, and now my function can also print Student array here.
    public static<T extends PrintInterface> void printArray(T[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i].print();
            System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] a = new int[10]; // we cannot define generic input as primitive data type
        Integer[] a = new Integer[10]; //  creating an Integer class(non-primitive data type) Array for generic input to function
        for (int i = 0; i < 10; i++) {
            a[i] = i + 1;
        }

        String[] s = new String[10]; //  creating an Integer class(non-primitive data type) Array for generic input to function
//        char c = 'a';
        for (int i = 0; i < 10; i++) {
            s[i] = Character.toString((char)((int)'a'  + i));
//            s[i] = Character.toString(c);
//            c++;
        }

//        printArray(a); // we are passing Integer array so method will automatically infer that "T" is Integer
//        printArray(s);

        // Vehicle class Object class se inherited hai kahin na kahin
        Vehicle[] v = new Vehicle[10]; // array of vehicle jinmein inn vehicles ka address aayega. everyone is null by default.
        for (int i = 0; i < 10; i++) {
            v[i] = new Vehicle(10) {
                @Override
                public boolean isMotorized() {
                    return false;
                }

                @Override
                public String getCompany() {
                    return "";
                }
            };
        }
        printArray(v);

        Student[] s1 = new Student[10]; // array of vehicle jinmein inn vehicles ka address aayega. everyone is null by default.
        for (int i = 0; i < 10; i++) {
            s1[i] = new Student();
        }

        printArray(s1);

        /**
         * Three cases in Generics
         * <T> -> No Bound. cannot call print() fn
         * <T extends Vehicle> -> Bounded. Can call print() fn. Only Vehicle and its subclass can be passed. But very restricted.
         * <T extends PrintInterface> -> Bounded. Only classes which implement PrintInterface or any other Interface which is defined like: <T extends exampleInterfaceName></>. Much better option
         * */

    }

}

