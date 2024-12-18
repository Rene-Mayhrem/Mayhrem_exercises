import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
  //? INPUT -> String with only lower case letters
  //? OUTPUT -> Longest palindromic substring
  //? SOLUTION 
  //? Create a String Builder -> longestSubstring = ""
  //? Iterate through my string using indices -> i = 0
    //? Create a variable aux to create substrings while -> aux >= i AND isPalindrome(longestSubstring) (false)
      //? Add current char to longestSubstring
      //? Move aux
    //? Check max length of strings
  //? Return longestSubstring value

  public String longestPalindrome (String s) {
    Queue<String> substrings = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
      // int aux = s.length() - 1;
      for (int j = s.length() - 1; j >= i; j--) {
        substrings.add(s.substring(i, j));
      }
    }
    String longestSubstring = String.valueOf(s.charAt(0));
    while (!substrings.isEmpty()) {
      String current = substrings.poll();
      if (isPalindrome(current) && (current.length() > longestSubstring.length())) {
        longestSubstring = current;
      }
    }
    return longestSubstring;
    
  }
  //? Create pointers -> start and end (0 and s.length() - 1)
  //? Move pointers while start <= end
    //? Check if characters at start and end pointers are different -> return false
  //? Return false
  private boolean isPalindrome (String s) {
    int start = 0;
    int end = s.length() - 1;
    while (start < end) {
      if (s.charAt(start) != s.charAt(end)) return false;
    }
    return true;
  }
}

//? In case of 'ab' false but 'bb'
