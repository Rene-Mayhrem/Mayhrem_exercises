import java.util.Arrays;

public class Solution {
    public int getMaximumNumberOfWords (String text, String brokenLetters) {
        boolean[] brokenAlphabet = new boolean[26];
        int wordsCounter = 0;
        // Fill broken letters
        for (char current : brokenLetters.toCharArray()) {
            brokenAlphabet[current - 'a'] = true;
        }
        // Find useful words
        for (String word : text.split(" ")) {
            boolean isValid = true;
            for (char current : word.toCharArray()) {
                if (brokenAlphabet[current - 'a']) {
                    isValid = false;
                    break;
                } 
            }
            if (isValid) wordsCounter++;
        }
        return wordsCounter;
    }
}