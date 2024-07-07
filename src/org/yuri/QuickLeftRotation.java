package org.yuri;

import java.util.Arrays;

public class QuickLeftRotation {

    public static void main(String[] args) {
        int[] arr = {-36, -28, 83, 59, -5, -22, 15, 64, 33, -85, -99, -94};

        int n = 12;
        int k = 276;

        leftRotate(arr, n, k);
        System.out.println(Arrays.toString(arr));

        test1();
    }

    static void leftRotate(int[] arr, int n, int k) {
        k = k % n; // Obter o ponto incial da matriz girada

        reverse(arr, 0, n-1); // Inverte o array completo
//        reverse(arr, n, k-1); // Inverte a primeira parte até o índice k-1
//        reverse(arr, 0, k-1); // Inverte a segunda parte do início até o índice k-1
    }

    static void reverse(int[] arr, int left, int right) {
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void test1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n  = arr.length;

        /*
            Entrada: [1, 2, 3, 4, 5, 6, 7]
            Inverte o array completo: [7, 6, 5, 4, 3, 2, 1]
            Inverte a primeira parte até o índice k-1 (k=2): [6, 7, 5, 4, 3, 2, 1]
            Inverte a segunda parte do início até o índice k-1 (k=2): [6, 7, 5, 4, 3, 2, 1]
         */

        int k = 0;
        leftRotate(arr, n, k);
        System.out.println(Arrays.toString(arr));

        /*
            Entrada: [6, 7, 5, 4, 3, 2, 1]
            Inverte o array completo: [1, 2, 3, 4, 5, 7, 6]
            Inverte a primeira parte até o índice k-1 (k=3): [3, 2, 1, 4, 5, 7, 6]
            Inverte a segunda parte do início até o índice k-1 (k=3): [3, 2, 1, 4, 5, 7, 6]
         */

        k = 3;
        leftRotate(arr, n, k);
        System.out.println(Arrays.toString(arr));

        /*
            Entrada: [3, 2, 1, 4, 5, 7, 6]
            Inverte o array completo: [6, 7, 5, 4, 1, 2, 3]
            Inverte a primeira parte até o índice k-1 (k=4): [4, 5, 7, 6, 1, 2, 3]
            Inverte a segunda parte do início até o índice k-1 (k=4): [4, 5, 7, 6, 1, 2, 3]
         */

        k = 4;
        leftRotate(arr, n, k);
        System.out.println(Arrays.toString(arr));
    }
}
