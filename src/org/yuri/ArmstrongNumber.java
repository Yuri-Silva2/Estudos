package org.yuri;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int number = in.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int sum = 0;
        String numberString = Integer.toString(number);
        int numberOfDigits = numberString.length();

        for (int i = 0; i < numberOfDigits; i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            sum += (int) Math.pow(digit, numberOfDigits);
        }

        return sum == number;
    }
}
