import java.util.HashMap;

public class Solution {
 public boolean isPalindrome (String phrase) {
  phrase = phrase.toLowerCase().replaceAll("[^a-z0-9]", "");
  // System.out.println(phrase);
  int start = 0, end = phrase.length() - 1;
  while (start < end) {
    if (phrase.charAt(start) != phrase.charAt(end)) return false;
    start++;
    end--;
  }
  return true;
 }
}
