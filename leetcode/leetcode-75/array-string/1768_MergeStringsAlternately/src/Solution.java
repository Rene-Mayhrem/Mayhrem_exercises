public class Solution {
  public String mergeAlternately (String word1, String word2) {
    // ? Create a StringBuilder to efficiently build the result string
    StringBuilder completeWord = new StringBuilder();

    // ? Initialize two pointers to traverse both strings
    int p1 = 0;
    int p2 = 0;

    // ? Iterate through both strings until both pointers reach the end of their resépectives strings
    while (p1 < word1.length() || p2 < word2.length()) {
      // ? Append the current character from words if the pointer is within bounds
      if (p1 < word1.length()) completeWord.append(word1.charAt(p1));
      if (p2 < word2.length()) completeWord.append(word2.charAt(p2));
      p1++;
      p2++;
    }
    // ? Convert the StringBuilder to a string and return it
    return completeWord.toString();
  }
}
