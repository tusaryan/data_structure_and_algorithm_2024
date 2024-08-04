package org.example.object_oriented_programming.generics;

// defining this <T> means -> we're telling the compiler that we will tell you what this is later when we create its object.
// <> this is called generic
// so now Pair class is Generic class
//To pass single generic parameter
//public class Pair<T> {
// To pass multiple parameters
public class Pair<T, V> {
    private T first;
    private V second;

    // T -> cannot put primitive data type, can can only pass non-primitive data type
    // T-> pass only actual class Objects
    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
