package com.leetcode;

public class VideoSolution {
  public String mergeAlternately(String word1, String word2) {
    //? Why am I using a StringBuilder instead of a String
    /*
     * String vs StringBuilder
     * STRING:
     * Immutable: Once a string is created, it cannot be changed -> any modification xcreates a new String Object
     * Performance: While concatenating string in a loop, each concatenation is creating a new String object
     * STRING_BUILDER:
     * Mutable: StringBuilder objects can be modified without creating new objects
     * Peformance: More efficient for string manipulation -> specially in loops as it avoids the overhead of creating multiple objects
     */
    // String result = ""; Replace it for a String Builder
    StringBuilder res = new StringBuilder();
    int n1 = word1.length();
    int n2 = word2.length();
    int p1 = 0, p2 = 0;
    //? iterate my words -> O(max(n1, n2))
    while (p1 < n1 || p2 < n2) {
      if (p1 < n1) {
        res.append(word1.charAt(p1));
        p1++;
      }
      if (p2 < n2) {
        res.append(word2.charAt(p2));
        p2++;
      }
    }
    return res.toString();
  }
}
