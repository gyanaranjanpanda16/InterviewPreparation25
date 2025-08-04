package JavaInterviewPackage;

import java.util.LinkedHashMap;
import java.util.Map;

//1. Find the First Non-Repeating Character in a String :-
//Problem Statement:
//Write a Java method that takes a string as input and returns the first non-repeating character.
// If there is no such character, return null.
//Examples:
//Input: "swiss"
//Output: 'w'
//
//Input: "aabbcc"
//Output: null
public class JavaBasicProgram {
//    public static Character firstNonRepeatingCharacter(String str) {
//        if (str == null || str.isEmpty()) {
//            return null;
//        }
//        int[] charCount = new int[256]; // Assuming ASCII characters
//        for (char c : str.toCharArray()) {
//            charCount[c]++;
//        }
//        for (char c : str.toCharArray()) {
//            if (charCount[c] == 1) {
//                return c;
//            }
//        }
//        return null; // No non-repeating character found
//    }

    public static void main(String[] args) {
        printFirstNonRepeatingCharacter("swiss");
        printFirstNonRepeatingCharacter("aabbcc");
    }

    private static void printFirstNonRepeatingCharacter(String input) {
        Character result = firstNonRepeatingCharacter(input);
        if (result != null) {
            System.out.println("First non-repeating character in \"" + input + "\": " + result);
        } else {
            System.out.println("No non-repeating character found in \"" + input + "\".");
        }
    }

    private static Character firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
}

