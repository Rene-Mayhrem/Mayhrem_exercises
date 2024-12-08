import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Solution {

  // ? 1. Create a Set which will contains my operators -> operators (class variable) - done
  // ? 2. Create an empty stack<Integer> -> numbers - done
  // ? 3. Iterate through my tokens array - doing
  // ? 3.1 Check if my current operators set doesn't contain my current token done
  // ? 3.1.2 (TRUE) -> Add the token to my stack (int) done
  // ? ELSE
  // ? Create two variables left and right -> pop integers in my stack done
  // ? 3.2.1 Use a switch with my token
  // ? 3.2.2 Every switch operator will act as the operator mathematically - done
  // ? 3.2.3 Append the result of every operation - done
  // ? 4. Return my last element of my stack with a pop

  private HashSet<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

  public int evalRPN(String[] tokens) {
    Stack<Integer> numbers = new Stack<>();
    for (String token : tokens) {
      if (!operators.contains(token)) {
        numbers.add(Integer.parseInt(token));
      } else {
        int right = numbers.pop();
        int left = numbers.pop();
        switch (token) {
          case "+":
            numbers.add(left + right);
            break;
          case "-":
            numbers.add(left - right);
            break;
          case "*":
            numbers.add(left * right);
            break;
          case "/":
            numbers.add(left / right);
            break;
        }
      }
    }
    return numbers.pop();
  }

  public int anotherSolution (String[] tokens) {
    Stack<Integer> numbers = new Stack<>();
    for (String token : tokens) {
      switch (token) {
        case "+":
          numbers.add(numbers.pop() + numbers.pop());
          break;
        case "-":
          int right = numbers.pop();
          int left = numbers.pop();
          numbers.add(left - right);
          break;
        case "*":
          numbers.add(numbers.pop() * numbers.pop());
          break;
        case "/":
          right = numbers.pop();
          left = numbers.pop();
          numbers.add(left / right);
          break;
        default:
          numbers.add(Integer.parseInt(token));
          break;
      }
    }
    return numbers.pop();
  }
}
