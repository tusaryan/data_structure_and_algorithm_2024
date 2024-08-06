package org.example.data_structures.array_list;

import java.util.ArrayList;
//ArrayList is a Dynamic version of Array
public class Arraylist {
    public static void main(String[] args) {
        //ArrayList is generic -> means can make array of any non-primitive data type. eg: String, Integer, Students, etc.
        //size -> number of elements entered by the user
        //capacity -> maximum element the arraylist can hold now
        //By default if no capacity size is given by user, then from internal logic it supplies 10;
        //if capacity fills up it increases its capacity by 1.5 or some x times. eg: 10 -> 15 or 10x.
        ArrayList<Integer> list1 = new ArrayList<>(5);
        System.out.println(list1.size());
        list1.add(15);  //byt default add it to end
        list1.add(20);
        list1.add(25);
        list1.add(2, 50); //add element 50 in index 2
//        System.out.println(list1.get(5)); // be careful while accessing element from index in ArrayList,
        // similar to Array it will throw index out of bounds exception
        System.out.println(list1.size());
        System.out.println("Element at index 2 : " + list1.get(2));//to access or get an element from index
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        //For each loop
        //instead of going through each index just like in for loop, for each loop will traverse through each element in that data structure
        //reading-> for each element in list1, print that element
        /** Note:
         * We generally use it for Quick Traversal/Move/Iterate through the array/data structure
         * Do not use it to edit/change/update any element
         * */
        for(int elem : list1) {
            System.out.print(elem + " ");
            elem = 100; //this will not change all element of list to 100
        }
        System.out.println();



//        list1.remove(1); // remove element from particular index
//        System.out.println("List after removing index 1 element is: " + list1);
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.print(list1.get(i) + " ");
//        }
//        System.out.println();
//        list1.set(1, 100); // to update or set element at a particular index
////        list1.add(2, 10);
//        System.out.println("List after updating index 1");
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.print(list1.get(i) + " ");
//        }
//        System.out.println();
//        list1.clear();
//        System.out.println("List after clearing");
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.print(list1.get(i) + " ");
//        }
//        System.out.println();
    }
}
