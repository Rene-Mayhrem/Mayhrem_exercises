package compressString;

public class Solution {
    public String getCompressedString (String word) {
        //? Constraints
        word = word.toLowerCase().trim();
        StringBuilder compressedString = new StringBuilder();
        int slow = 0;
        while (slow < word.length()) {
            int consecutiveChars = 1;
            int fast = slow + 1;
            while (fast < word.length() && word.charAt(slow) == word.charAt(fast)) {
                consecutiveChars++;
                fast++;
            }
            compressedString.append(word.charAt(slow)).append(consecutiveChars);
            slow = fast;
        }
        return compressedString.toString().length() < word.length() ? compressedString.toString() : word;
    }
}
