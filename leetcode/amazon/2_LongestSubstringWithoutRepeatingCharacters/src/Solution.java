import java.util.HashSet;

public class Solution {
  /*
   * PROBLEM OBJECTIVE -> Find the "length" of the "longest substring" without repeating chars
   * INPUT ->
   * - The string is never going to be empty
   * - english chars, digits, symbols and spaces
   * OUTPUT -> 
   * - Integer -> representing the length of a substring
   * SOLUTION
   * Create a variable to represent the max length of every substring -> max -> 0
   * * Create a hashSet
   * Iterate the string
    * If the set doesn't contains the element
      * We added
    * The set already contains the element
      * maxLen -> set.size() -> the max element between set size and max value
      * Empty the set
    * Return maxLen
   */
  public int lengthOfLongestSubstring (String s) {
    int max = 0;
    HashSet<Character> substring = new HashSet<>();
    for (char character : s.toCharArray()) {
      System.out.println(character);
      if (!substring.contains(character)) {
        substring.add(character);
      } else {
        max = Math.max(max, substring.size());
        substring.clear();
        substring.add(character);
      }
      System.out.println(substring);
      max = Math.max(max, substring.size());
    }
    return max;
  }

  public int longestLengthOfSubstring (String s) {
    int max = 0;
    HashSet<Character> substring = new HashSet<>();
    for (int i = 0; i < s.length(); i++) { 
      int aux = i;
      while(aux < s.length() && !substring.contains(s.charAt(aux))) {
        substring.add(s.charAt(aux));
        aux++;
      }
      max = Math.max(substring.size(), max);
      substring.clear();
    }
    return max;
  }
}
