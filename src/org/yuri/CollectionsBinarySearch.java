package org.yuri;

import java.util.Arrays;
import java.util.Collections;

public class CollectionsBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Collections.binarySearch(Arrays.stream(arr)
                .boxed()
                .toList(), 7));
    }
}