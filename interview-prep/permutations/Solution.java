// Problem: Given two strings, write a method to decide if one is a permutation of the other.

// How would you define "permutation" in this context? What does it mean for one string to be a permutation of another?

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //? INPUT: 2 strings, contains only letters
    //? APPROACH
    //? The strings can contains duplicates
    //? Permutation meaning: the strings contains the exact characters, but not necessary in the same order
    //? CONSTRAINTS -> 
    // ? Consider spaces
    // ? Consider case sensitivy
    //? Create two map, one for each, and then, compare strings
    public boolean isPermutable (String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        Map<Character, Integer> characterCounter = new HashMap<>();
        int size = word1.length();
        
        for (int i = 0; i < size; i++){
            char current = word1.charAt(i);
            int count = characterCounter.getOrDefault(current, 0);
            characterCounter.put(current, count + 1);
        }

        for (int i = 0; i < size; i++) {
            char current = word2.charAt(i);
            if (!characterCounter.containsKey(current)) return false;
            int count = characterCounter.getOrDefault(current, 0) - 1;

            if (count == 0) {
                characterCounter.remove(current);
            } else {
                characterCounter.put(current, count);
            }
        }
        return characterCounter.isEmpty();
    }
}
