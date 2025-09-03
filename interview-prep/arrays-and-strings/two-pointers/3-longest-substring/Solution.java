import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    //? Given a string 's' find the length of the longest substring without duplicate chars
    //? INPUT 
    //? Do I need to consider spaces, commas and more as a characters or is it more like something I need to clean up first?
    //? RETURN -> size of the longest substring
    //? 1st APPROACH
    //? DSA -> Set: Because it does not allow duplicate values -> time complexity -> cost effective
    //? Two pointers: slow for traverse one by one the elements 
    //?               fast for move and create the substrings
    //? Create an auxiliar var to keep the max value 
    //? WORKFLOW | STEPS
    //? Create maxLenght = 0 -> keep track of max value
    //? Create an empty set
    //? Treverse the the characters of s with "slow" pointer
    //? In every iteration -> use a while to create the substring using the pointer "fast"
    //? Add characters to the set while it doesn't contain any duplicates
    //? (Duplicate found) -> Assign the max value between the current value of maxLenght & the set size
    public int getLengthOfLongestSubstring(String s) { 
        int maxLenght = 0;
        HashSet<Character> substring = new HashSet<>();
        for (int slow = 0; slow < s.length(); slow++) {
            int fast = slow;
            while(!substring.contains(s.charAt(fast)) && fast < s.length()) {
                substring.add(s.charAt(fast++));
            }
            substring.clear();
            maxLenght = Math.max(maxLenght, substring.size());
        }
        return maxLenght;
    }
}
