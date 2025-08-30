public class Solution {
    public boolean isPalindrome (String s) {
        //? Using pointers -> left and right
        int left = 0, right = s.length() - 1;
        //? Iterate the String s, while left <= right
        while (left <= right) {
            //? Compare the characters at pointer left and pointer right
            //? return false if those are different
            if (s.charAt(left) != s.charAt(right)) return false;
            //? In other case, increase left and decrease right pointers
            left++; right--;
        }
        //? return true after the while condition
        return true;
    }
}
