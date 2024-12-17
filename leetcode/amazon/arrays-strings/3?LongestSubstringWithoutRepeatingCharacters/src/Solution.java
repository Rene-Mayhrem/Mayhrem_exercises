import java.util.HashSet;

public class Solution {
  // Given a string s, find the length of the longest
  // substring
  // without repeating characters.
  // Example 1:

  // Input: s = "abcabcbb"
  // Output: 3
  // Explanation: The answer is "abc", with the length of 3.
  // Example 2:

  // Input: s = "bbbbb"
  // Output: 1
  // Explanation: The answer is "b", with the length of 1.
  // Example 3:

  // Input: s = "pwwkew"
  // Output: 3
  // Explanation: The answer is "wke", with the length of 3.
  // Notice that the answer must be a substring, "pwke" is a subsequence and not a
  // substring.
  
  //? INPUT -> string str 
  //? OUTPUT -> longest substring -> length
  //? SOLUTION
  //? Create a hashSet - Characters
  //? maxLength -> 0 
  //? Iterate through my string -
    //? Create aux variable -> i (to move and create the substring indices)  
    //? Create a substring starting by index i -> adding element to my set while my set function "contains" is false && aux less than length of the string
    //? Reassign the maxLength -> max between maxLength and set size
    //? Remove all element from my set
  //? return maxLength
  public int getLengthOfLongestSubstring (String str) {
    HashSet<Character> substring = new HashSet<>();
    int maxLength = 0;
    for (int i = 0; i < str.length(); i++) {
      int j = i;
      while (j < str.length() && !substring.contains(str.charAt(j))) {
        substring.add(str.charAt(j));
        j++;
      }
      maxLength = Math.max(maxLength, substring.size());
      substring.clear();
    }
    return maxLength;
  }
}
