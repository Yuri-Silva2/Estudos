package org.yuri;

public class Quicksort {

    static void quickSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int pi = par(a, lo, hi);

            quickSort(a, lo, pi - 1);
            quickSort(a, pi + 1, hi);
        }
    }

    static int par(int[] a, int lo, int hi) {
        int pi = a[lo];
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (a[j] < pi) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[hi];
        a[hi] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
