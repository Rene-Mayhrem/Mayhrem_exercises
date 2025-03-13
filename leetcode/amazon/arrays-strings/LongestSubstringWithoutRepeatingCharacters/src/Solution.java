import java.util.HashSet;

public class Solution {
  // ! Longest substring from a string without repeating characters
  // ? FIRST APPROACH?
  // ? What's the Data Structure that doesn't allow repeated values? Set
  // ? Create a Set that will hold the substring
  // ? Iterate the word by elements and add elements while the element is not in the set
  public int lengthOfLongestSubstring(String word) {
    HashSet<Character> substring = new HashSet<>();
    int longestSubstring = 0;
    for (int i = 0; i < word.length(); i++) {
      //? Create the substring while the set doesn't contain any repeated character
      int aux = i;
      while (!substring.contains(word.charAt(i)) && aux < word.length()) {
        substring.add(word.charAt(aux++));
      }
      longestSubstring = Math.max(longestSubstring, substring.size());
    }
    return longestSubstring;
  }

  public int lengthOfLongestSubstringImproved (String word) {
    HashSet<Character> substring = new HashSet<>();
    int longestSubstring = 0;
    int left = 0; //? pointer to keep track of substrings

    for (int right = 0; right < word.length(); right++) {
      while (substring.contains(word.charAt(right))) {
        substring.remove(word.charAt(left));
        left++;
      }
      substring.add(word.charAt(right));
      longestSubstring = Math.max(longestSubstring, right - left + 1);
    }
    return longestSubstring;
  }
}
