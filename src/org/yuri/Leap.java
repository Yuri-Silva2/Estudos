package org.yuri;

public class Leap {

    public static void main(String[] args) {
        String i = "tobor"; //robot

        System.out.println(new StringBuilder(i).reverse());

        char[] arr = i.toCharArray();

        int n = arr.length;
        int k = 0;
        leftRotate(arr, n, k);
        System.out.println(String.valueOf(arr));
    }

    static void leftRotate(char[] arr, int n, int k) {
        reverse(arr, k, n-1);
    }

    public String twofer(String name) {
        return switch (name) {
            case "Alice" -> "One for Alice, one for me.";
            case "Bohdan" -> "One for Bohdan, one for me.";
            case "Zaphod" -> "One for Zaphod, one for me.";
            default -> "One for you, one for me.";
        };
    }

    static void reverse(char[] arr, int left, int right) {
        while (left <= right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
