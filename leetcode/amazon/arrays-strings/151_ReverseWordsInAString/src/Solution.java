import java.util.Arrays;

public class Solution {
  // public String reverseWords(String string) {
  //   String[] words = string.trim().split(" ");
  //   int start = 0, end = words.length - 1;
  //   while (start <= end) {
  //     if (words[start] != " " && words[end] != " ") {
  //       if (start != end) {
  //         String temp = words[start] + " ";
  //         words[start] = words[end] + " ";
  //         words[end] = temp;
  //       } else {
  //         words[start] = words[start] + " ";
  //       }
  //     }
  //     start++;
  //     end--;
  //   }
  //   StringBuilder result = new StringBuilder();
  //   for (String word : words) {
  //     System.out.println(word);
  //     result.append(word);
  //   }
  //   return result.toString();
  // }
  public String reverseWords (String string) {
    String[] words = string.trim().split(" ");
    int start = 0, end = words.length - 1;
    while (start <= end) {
      if (start != end) {
        String temp = words[start]+" ";
        words[start] = words[end]+" ";
        words[end] = temp;
      } else {
        words[start] = words[start]+" ";
      }
      start++;
      end--;
    }
    // StringBuilder result = new StringBuilder();
    // for (String word : words) if (!word.equals(" ")) result.append(word);
    // return result.toString();
    return String.join(" ", words);
  }
}
