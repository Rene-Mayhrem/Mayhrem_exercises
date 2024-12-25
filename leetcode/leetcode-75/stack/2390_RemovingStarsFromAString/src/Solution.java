import java.util.Stack;

public class Solution {
  public String removeStars (String s) {
    Stack<Character> stack = new Stack<>();
    for (Character character : s.toCharArray()) stack.add(character);
    for (Character character : stack) {
      System.out.println(character);
    }
    System.out.println(stack);
    return stack.toString();
  }
}
