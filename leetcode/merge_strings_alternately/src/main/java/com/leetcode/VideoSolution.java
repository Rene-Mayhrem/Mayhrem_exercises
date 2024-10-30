package com.leetcode;

public class VideoSolution {
  public String mergeAlternately(String word1, String word2) {
    String result = "";
    int n1 = word1.length();
    int n2 = word2.length();
    int p1 = 0, p2 = 0;
    //? iterate my words -> O(max(n1, n2))
    while (p1 < n1 || p2 < n2) {
      if (p1 < n1) {
        result += word1.charAt(p1);
        p1++;
      }
      if (p2 < n2) {
        result += word2.charAt(p2);
        p2++;
      }
    }
    return result;
  }
}
