package org.example.data_structures.linked_list;

import org.example.data_structures.linked_list.Node;

import java.util.Scanner;

public class LinkedListUse {

    public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter elements or -1 to exit: ");
        //to store the first data
        int data = s.nextInt();

        while(data != -1) {
            //create new node and store first data in the Linked List
            Node<Integer> newNode= new Node<Integer>(data);
            //add first node address to head
            if(head == null) {
                head = newNode;
                tail = newNode;
            }else {
                /**
                // to create a link in nodes

                //temp start with head
                Node<Integer> temp = head;
                //Is it the last node in linked list
                while(temp.next != null) {
                    //to move to next node
                    temp = temp.next;
                }

                //store the address of new input node to this current last node of linked list
                //since it has no link to next i.e. it is null, so we will create a link between the new last and its prev node
                //to do that we store the address of new last node to the node just before it
                temp.next = newNode;
                //now this will be 2nd last node with address to the new last node
                */

                tail.next = newNode; //to Link the newNode with the prev node
                tail = newNode; // or tail = tail.next //to Update the tail Address to the new last node
                // Now new Time complexity = 1+ 1+1+1...+1
                // Time complexity = O(n)
            }
            //take the next input
            data = s.nextInt();
            //Older time complexity is 1+1+2+3+4...+n-1
            //sum of first na natural number. (n-1)(n)/2
            //Time complexity -> O(n^2)
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        Node<Integer> current = head;
        //this is a local head limited to print function it has no link with main function head.
        // both head are different in -> print and main function.
        //storing in temp variable/current so that we have original head reference to perform other operation later.
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //Everything is java is passed by value
    public static void increment(Node<Integer> head) {
        //both main and increment are pointing to same address, that's why the data is changing
        Node<Integer> current = head;
        while (current != null) {
            current.data++;
            current = current.next;
        }
        System.out.println();
    }

    public static int length(Node<Integer> head) {
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static int getIthNode(Node<Integer> head, int i) {
        Node<Integer> current = head;
        int count = 0;
        while (current != null && count < i - 1) {
            count++;
            current = current.next;
        }
        if (current != null) {
            return current.data;
        }else {
            return -1;
        }
    }

    public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
        Node<Integer> newNode = new Node<>(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        int i = 0;
        Node<Integer> temp = head;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static Node<Integer> delete(Node<Integer> head, int pos) {

        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        int count = 0;
        Node<Integer> current = head;
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
        if (current == null  || current.next == null) {
            return head;
        }
        current.next = current.next.next;
        return head;
    }

    public static void main(String[] args) {
//        Node<Integer> node1 = new Node<>(10);
//        System.out.println(node1.data);
//        System.out.println(node1.next);

//        Node<Integer> node2 = new Node<>(20);
//        node1.next = node2;
//        System.out.println(node2);
//        System.out.println(node1.next);
//        Node<Integer> node3 = new Node<>(30);
//        node2.next = node3;
//        Node<Integer> head = node1;
//        print(head);
//        print(head);
        Node<Integer> head = takeInput();
//        printR(head);

//        increment(head);
//        System.out.println("After increment of each element");
//        printR(head);

        System.out.println("\nLength: " + length(head));

        System.out.println("3rd Node is: " + getIthNode(head, 3));
//        head = insertR(head, 80, 2);
////        head = insertR(null, 20, 0);
//        System.out.println("\nAfter inserting, head is : ");
//        print(head);
//        head = delete(head, 2);
//        System.out.println("After deleting, head is : ");
//        print(head);
    }
}
