import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public Boolean isValidParentheses (String word) {
        if (word.length() % 2 != 0) return false; 
        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put('{', '}');
        parentheses.put('(', ')');
        parentheses.put('[', ']');
        Stack<Character> openingBrackets = new Stack<>();
        for (Character current : word.toCharArray()) {
            if (parentheses.containsKey(current)) {
                openingBrackets.add(current);
            } else if (!openingBrackets.isEmpty()) {
                char element = openingBrackets.pop();
                if (parentheses.get(element) != current) return false;
            } else return false;
        } 
        return openingBrackets.isEmpty();
    }
}
