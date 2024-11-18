import java.util.Stack;

public class Solution {
  public void reverseString (char[] word) {
    Stack<Character> stackChar = new Stack<>();
    for (char character : word) stackChar.add(character);
    for (int i = 0; !stackChar.isEmpty(); i++) word[i] = stackChar.pop();
  }

  public void reverseStringTwoPointers (char[] word) {
    int left = 0, right = word.length - 1;
    while (left < right) {
      char temp = word[left];
      word[left] = word[right];
      word[right] = temp;
      left++;
      right--;
    }
  }
}
