package FirstUniqueCharacter;

public class Solution {
    public int getFirstUniqueCharacter (String word) {
        int[] frequencyAlphabet = new int[26];
        // Fill the frequency alphabet
        for (char current : word.toCharArray()) {
            frequencyAlphabet[current - 'a'] += 1;
        }
        // Find the first unique index
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (frequencyAlphabet[current - 'a'] == 1) return i;
        }
        return -1; // no unique values
    }
}


