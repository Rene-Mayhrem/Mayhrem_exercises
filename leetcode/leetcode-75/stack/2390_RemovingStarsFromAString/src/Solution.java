import java.util.Stack;

public class Solution {
  public String removeStars (String s) {
    Stack<Character> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();
    for (Character character : s.toCharArray()) {
      if (character == '*') {
        stack.pop();
      } else {
        stack.add(character);
      }
    }

    for (Character character : stack) sb.append(character);
    return sb.toString();
  }
}
