package com.leetcode;


public class Solution {
  public String mergeAlternately (String word1, String word2) {
    String mergedWord = "";
    // List<Character> wordChar1 = word1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    // List<Character> wordChar2 = word1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    
    // while (!wordChar1.isEmpty() && !wordChar2.isEmpty()) {
    //   try {
    //     mergedWord += wordChar1.get(0);
    //     wordChar1.remove(wordChar1.get(0));
    //   } catch (Exception e) {

    //   }
    // }
    char[] charArray1 = word1.toCharArray();
    char[] charArray2 = word2.toCharArray();
    int pointer1 = 0;
    int pointer2 = 0;
    while (pointer1 < charArray1.length || pointer2 < charArray2.length) {
      System.out.println("P1 -> "+pointer1);
      System.out.println("P2 -> "+pointer2);
      if (pointer1 < charArray1.length) {
        mergedWord += charArray1[pointer1];
        pointer1++;
        if (pointer2 < charArray2.length) {
          mergedWord += charArray2[pointer2];
          pointer2++;
        }
      } else if (pointer2 < charArray2.length) {
        mergedWord += charArray2[pointer2];
        pointer2++;
      }
    }
    return mergedWord;
  }
}
