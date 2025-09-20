package interview

import java.util.HashSet;
import java.util.Set;

-prep-1.LongestSubstringWithoutRepeating;

public class Solution {
    public int maximumSubstringWithoutDuplication (String word) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        Set<Character> substring = new HashSet<>();
        while (right < word.length()) {
            char curr = word.charAt(right);
            if (substring.contains(curr)){
                while (substring.contains(curr)) {
                    substring.remove(word.charAt(left++));
                }
            }  else {
                substring.add(curr);
                right++;
            }
            maxLength = Math.max(maxLength, substring.size());
        }
        return maxLength;
    }
}
