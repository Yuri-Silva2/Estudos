package org.yuri;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        // Size of the Vector
        int n = 5;

        // Declaring the Vector with
        // initial size n

        Vector<Integer> v = new Vector<>(n);

        // Appending new elements at
        // the end of the vector
        for (int i = 1; i <= n; i++)
            v.add(i);

        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the vector
        // after deletion
        System.out.println(v);

        // iterating over vector elements
        // using for loop
        // Printing elements one by one
        for (Integer integer : v ) System.out.print(integer + " ");
    }
}
