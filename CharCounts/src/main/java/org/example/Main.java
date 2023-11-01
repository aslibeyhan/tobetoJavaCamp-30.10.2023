package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String input = "Asli Beyhan";
        countAndPrintCharacterCounts(input);
    }

    public static void countAndPrintCharacterCounts(String input) {
        //Creating a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert input string to lowercase
        input = input.toLowerCase();

        // Iterate through characters in an array
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                // Only count letters, not other characters
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Printing character counts
        for (char c : charCountMap.keySet()) {
            System.out.println(c + ":" + charCountMap.get(c));
        }
    }
    }
