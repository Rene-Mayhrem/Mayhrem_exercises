import java.util.HashSet;
import java.util.Set;

public class Solution {
   
  /*
   * Input -> normal string
   * output -> reversed string (only vowels)
   */
  public String reverseVowels (String s) {
    int left = 0, right = s.length() - 1;
    char[] result = s.toCharArray();
    while (left < right) {
      if (isVowel(result[left]) && isVowel(result[right])) {
        char temp = result[left];
        result[left] = result[right];
        result[right] = temp; 
        left++;
        right--;
     } else if (isVowel(result[left])) { 
        right--;     
      } else if (isVowel(result[right])) {
        left++;
      } else {
        left++;
        right--;
      }
    }
    return new String(result);
  }

  public String reverseWordByVowels (String word) {
    char[] result = word.toCharArray();
    int left = 0, right = result.length - 1;
    while (left < right) { 
      while (left < result.length && !isVowel(result[left])) left++;
      while (right >= 0 && !isVowel(result[right])) right--;
      if (left < right) {
        char temp = result[left];
        result[left] = result[right];
        result[right] = temp;
      }
    }
    return new String(result);
  }

   private boolean isVowel (char character) {
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    return vowels.contains(character);
  }

  
}
