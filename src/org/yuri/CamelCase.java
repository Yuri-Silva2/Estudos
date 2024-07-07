package org.yuri;

import java.util.Scanner;

public class CamelCase {

    private static String camelCaseFour(String input) {
        String[] parts = input.split(";");
        String operation = parts[0].toUpperCase();
        String type = parts[1].toUpperCase();
        String content = parts[2].replaceAll("[()]", "");

        return switch (operation) {
            case "C" -> combineCamelCase(type, content);
            case "S" -> splitCamelCase(content);
            default -> "";
        };
    }

    private static String combineCamelCase(String type, String content) {
        String[] words = content.split(" ");
        boolean capitalizeFirst = type.equals("C") || type.equals("M") || type.equals("V");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            word = capitalizeFirst ? capitalizeFirstLetter(word) : word.toLowerCase();
            result.append(word);
        }

        if (type.equals("M")) {
            result.append("()");
        }

        return result.toString();
    }

    private static String splitCamelCase(String content) {
        StringBuilder result = new StringBuilder();

        for (char currentChar : content.toCharArray()) {
            if (Character.isUpperCase(currentChar)) {
                result.append(" ").append(Character.toLowerCase(currentChar));
            } else {
                result.append(currentChar);
            }
        }

        return result.toString().trim();
    }

    private static String capitalizeFirstLetter(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        while (scanner.hasNext())
            System.out.println(camelCaseFour(scanner.next()));
    }
}
