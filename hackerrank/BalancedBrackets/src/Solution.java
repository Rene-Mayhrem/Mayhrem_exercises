import java.util.HashMap;
import java.util.Stack;

public class Solution {

  // ? INPUT -> String - assumption -> input only contains bracktes
  //? OUTPUT -> Boolean - ONLY -> It contains matched brackets - the matched brackets has an order 
  //? SOLUTION
  // ? Check if s.length % 2 != 0 -> return false -> there's no matched brackets
  // ? Split my string into an array of chars
  // ? Create a hashMap of -> brackets
  // ? Create two pointer -> low and high (first and last elements)
  // ? Iterate the array while low < high
    // ? Check hash.get(key) != s[high] -> false
  //? return true -> matched pairs 

  private HashMap<Character, Character> map = new HashMap<>();

  public Solution () {
    map.put('{', '}');
    map.put('[', ']');
    map.put('(', ')');
  }

  
  public String isBalanced (String input) {
    if (input.length() % 2 != 0) return "NO";
    Stack<Character> sequence = new Stack<>();
    for (char current : input.toCharArray()) {
      if (map.containsKey(current)) {
        sequence.push(current);
      } else if (map.containsValue(current)) {
        if (sequence.isEmpty() || map.get(sequence.pop()) != current) {
          return "NO";
        }
      }
    }
  }
}
