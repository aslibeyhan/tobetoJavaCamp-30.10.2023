package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String metin = scanner.nextLine();
        scanner.close();

        if (hasAllUniqueCharacters(metin)) {
            System.out.println("All characters are unique");
        } else {
            System.out.println(" Contains repeating characters");
        }
    }

    static boolean hasAllUniqueCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) != str.lastIndexOf(currentChar)) {
                return false;
            }
        }
        return true;
    }

}