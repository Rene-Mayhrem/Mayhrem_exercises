package Palindrome;

public class Solution {
    public boolean isPalindrome (String word) {
        //? Preproccesing the current string
        word = word.toLowerCase();
        //? Traversing the string
        int left = 0, right = word.length() - 1;
        while (left < right) {
            while(left < right && !Character.isLetterOrDigit(word.charAt(left))) left++;
            while(left < right && !Character.isLetterOrDigit(word.charAt(right))) right--;
            if (word.charAt(left) != word.charAt(right)) return false;
            right--;
            left++;
        }
        return true;
    }   
}
