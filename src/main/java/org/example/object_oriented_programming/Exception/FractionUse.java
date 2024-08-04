package org.example.object_oriented_programming.Exception;

import java.io.File;
import java.io.FileNotFoundException;

public class FractionUse {

    public static void temp() throws ZeroDenominatorException {
        Fraction f1 = new Fraction(1, 2);
        f1.print();

        f1.setNumerator(12);
        int d = f1.getDenominator();
        System.out.println(d);
        f1.print();

        f1.setNumerator(10);
        int i = 47;
        try {
            i++;
            f1.setDenominator(0);
            i++;
        } catch (ZeroDenominatorException e) {
            System.out.println("Hey don't input 0 as denominator");
        } finally {
            // Common code for try and catch is written here
            // Code which should be executed at any case. Whether try or catch is executed.
        }
        System.out.println(i);

        f1.print();

        Fraction f2 = new Fraction(3, 4);
        f1.add(f2);
        f1.print();
        f2.print();

        Fraction f3 = new Fraction(1, 2);
        f3.multiply(f2);
        f3.print();
        f2.print();

        Fraction f4 = Fraction.add(f1, f3);
        f1.print();
        f3.print();
        f4.print();
    }

    public static void main(String[] args) throws ZeroDenominatorException {
        temp();
        /**
         String s = "";
         File f;
         try {
         f = new File(s);
         // read file
         //            f.close(); // we will always process this either wo try mein jaye ya catch mein. So,
         } catch(FileNotFoundException exception) {
         //            f.close();
         } finally {
         f.close(); //So we generally move our common code here
         // which will always be executed independent of any one is executed weather try or catch.
         }
         */
    }
}
