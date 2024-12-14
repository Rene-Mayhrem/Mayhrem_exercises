import java.util.HashMap;
import java.util.Stack;

public class Solution {

  // ? INPUT -> String - assumption -> input only contains bracktes
  //? OUTPUT -> Boolean - ONLY -> It contains matched brackets - the matched brackets has an order 
  //? SOLUTION
  // ? Check if s.length % 2 != 0 -> return false -> there's no matched brackets
  // ? Split my string into an array of chars
  // ? Create a hashbrackets of -> brackets
  // ? Create two pointer -> low and high (first and last elements)
  // ? Iterate the array while low < high
    // ? Check hash.get(key) != s[high] -> false
  //? return true -> matched pairs 

  private static HashMap<Character, Character> brackets = new HashMap<>();

  public Solution () {
    brackets.put('{', '}');
    brackets.put('[', ']');
    brackets.put('(', ')');
  }

  
  public static String isBalanced (String input) {
    if (input.length() % 2 != 0) return "NO";
    Stack<Character> sequence = new Stack<>();
    for (char current : input.toCharArray()) {
      if (brackets.containsKey(current)) {
        sequence.push(current);
      } else if (brackets.containsValue(current)) {
        System.out.println(sequence);
        if (sequence.isEmpty() || brackets.get(sequence.pop()) != current) {
          return "NO";
        }
      }
    }
    return sequence.isEmpty() ? "YES" : "NO";
  }

  public String isBalancedBrackets(String s) {
    if (s.length() % 2 != 0) return "NO";
    Stack<Character> sequence = new Stack<>();
    for (char current : s.toCharArray()) {
        if (brackets.containsKey(current)) {
            sequence.push(current);
        } else if (brackets.containsValue(current)) {
            if (sequence.isEmpty() || brackets.get(sequence.pop()) != current) {
                return "NO";
            }
        }
    }
    return sequence.isEmpty() ? "YES" : "NO";
    
}
}
