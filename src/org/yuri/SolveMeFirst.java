package org.yuri;

import java.util.Scanner;

public class SolveMeFirst {

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(sum(a, b));
    }
}
