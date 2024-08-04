package org.example.object_oriented_programming.classes_and_objects;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Aryan";
        s1.rollumber = 8;

        Student s2 = new Student();
        s2.name = "Tunu";
        s2.rollumber = 4;

        System.out.println(s1);
        System.out.println(s2.name);

    }
}
