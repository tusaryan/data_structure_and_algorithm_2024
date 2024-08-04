package org.example.object_oriented_programming.generics;

public class PairUse {

    public static void main(String[] args) {
        // so whenever we use Pair we will write Pair<Type>
        Pair<String, String> p = new Pair<String, String>("ab", "cd");
        p.setFirst("def");
        String s = p.getFirst();

        // By default, if we do not provide <T> it will consider it as object
        // So, there is an Object class and every class is somehow inherited from Object class.
        // Like in vehicle folder/package created Vehicle class and Car class inherit -> Vehicle class
        // Vehicle was inheriting Object class so Car ke paas bhi saari Object waali property aa gayi.
        Pair p1 = new Pair(1, 2); // So, By default they are object. We'll never do this since it is very problematic.
        p1.setFirst("ghi"); // Since it is an object aur humne ismein pehle integer daala tha but now we can also put String

        /**
         * Jaise hum Vehicle mein Car daal sakte the, since Car was inheriting Vehicle
         * Similar we can put anything in Object because every subclass someway down the chain is inherited from Object so any subclass of object can be put here
         *
         * Vehicle v = new Car();
         * Object o = new     ();
         */
        Pair<Integer, String> p2 = new Pair<Integer, String>(2, "temp"); // Wrong since int is a primitive Data type it is not object. So, int type ka pair nahi bana sakte
        // we can create generic of subclasses of Object. in <T>, T has to be Object of a class
        // Integer and int are almost same thing. Behave in same way
        Integer a1 = 10; // only difference is Integer is a class. "Integer a = " means we are creating an object
        int i = a1;

        // we cannot put primitive data type in Generics but corresponding to every primitive data type a Superficial class is there we can use that.
        //int -> Integer, char -> Character, boolean -> Boolean
        Pair<Character, Character> p3 = new Pair<>('a', 'c'); // for newer versions of java we don't need to pass type again like this new Pair<>()

        // without using triplet class to achieve this Pair<int, int ,int>
        int a = 10;
        int b = 12;
        int c = 23;

        Pair<Integer, Integer> internalPair = new Pair<>(a, b);
        Pair<Pair<Integer, Integer>, Integer> p4 = new Pair<>(internalPair, c);
        // Effectively yeh hai Pair<[10, 12], 23>

        System.out.println(p4.getSecond());
        System.out.println(p4.getFirst().getFirst());
        System.out.println(p4.getFirst().getSecond());
    }
}
