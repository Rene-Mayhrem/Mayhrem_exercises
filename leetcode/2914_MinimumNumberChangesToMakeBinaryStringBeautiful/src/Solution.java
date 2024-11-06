public class Solution {
  public int minChanges (String word) {
    if (word.length() == 2) return 0;
    int changes = 0;
    for (int i = 0; i < word.length(); i+= 2) {
      if (word.charAt(i) != word.charAt(i + 1)) {
        changes++;
      }
    }
    return changes;
  }
}

/*
 * 010011001010 -> 1
 * 0000110010101 
 */