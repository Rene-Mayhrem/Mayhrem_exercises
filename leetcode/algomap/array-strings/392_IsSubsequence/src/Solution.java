import java.util.HashMap;

public class Solution {
    
  public boolean isSubsequence (String s, String t) {
    int sPointer = 0;
    int tPointer = 0;
    while (sPointer < s.length() && tPointer < t.length()) {
      if (s.charAt(sPointer) == t.charAt(tPointer)) sPointer++;
      tPointer++;
    }
    return sPointer == s.length();
  }

  // ? INPUT
  // * Two strings -> can be empty
  // ? OUTPUT
  // * Return boolean is s is a subsequence of t
  // ? SOLUTION
  // * Check if s is empty -> return true
  // * Check if t is empty -> return false
  // * Create a flag pointer to check if s is subsequence
  // * Iterate through "t" string element by element
    // * Check if character at flag s is the same than current t element -> increment flag pointer
    // * Check if flag pointer is equal than s string length -> return true
  // * After the iteration return (flag >= s length) 
  public boolean isSubsequenceTwo (String s, String t) {
    if (s.length() == 0) return true;
    if (t.length() == 0) return false;
    int pointer = 0;
    for (int i = 0; i < t.length(); i++) {
      if (s.charAt(pointer) == t.charAt(i)) pointer++;
      if (pointer >= s.length()) return true;
    }
    return pointer >= s.length();
  }

}
