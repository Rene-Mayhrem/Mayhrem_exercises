public class Solution {
  public int isPrefixOfWord (String sentence, String searchWord) {
    String[] words = sentence.split(" ");
    for (int i = 0; i < words.length; i++) {
      if (words[i].contains(searchWord)) return i + 1;
    }
    return -1;
  }
}
