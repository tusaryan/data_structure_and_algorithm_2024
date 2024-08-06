package org.example.data_structures.linked_list;

public class Node<T> {

    //each element/entry -> node
    //every node has two property i.e.,
    //each node stores only the Data/element and the address of its next node in the memory, last node stores null.
    //first node -> head, last node -> tail
    //Note: remember to store the address of next node otherwise our link to next node will break;

    T data; //to store data
    Node<T> next; //to store address of next node

    //Constructor
    Node(T data) {
        this.data = data;
        next = null;
    }
}
