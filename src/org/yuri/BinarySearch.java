package org.yuri;

 /*
    https://pt.khanacademy.org/computing/computer-science/algorithms/intro-to-algorithms/a/route-finding
    https://pt.khanacademy.org/computing/computer-science/algorithms/binary-search/a/implementing-binary-search-of-an-array
 */

public class BinarySearch {

    int binarySearch(int[] arr, int x) {
        int min = 0, max = arr.length - 1; // First and last index

        while (min <= max) { // As long as the first index is smaller than the last index
            int average = min + (max - min) / 2; // Find the average

            if (arr[average] == x) return average; // If the value of the average obtained through the index is equal to the value sought returns {index}

            if (arr[average] < x) min = average + 1;
            else max = average - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();

        int[] arr = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 40;

        int result = search.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Elemento não está presente na matriz");
        else
            System.out.println("Elemento está presente no índice " + result);
    }
}
