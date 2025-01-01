public class Solution {
  public void reverseString (String str) {
    int left = 0;
    int right = str.length() - 1;
    char[] characters = str.toCharArray();
    while (left < right) {
      char temp = characters[left];
      characters[left] = characters[right];
      characters[right] = temp;
      left++;
      right--;
    }
  }
}
