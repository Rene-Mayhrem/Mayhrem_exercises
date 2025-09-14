package stacks.ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid (String word) {
        Map<Character, Character> brackets = new HashMap<Character, Character>(){{
            put('{', '}');
            put('[', ']');
            put('(', ')');
        }};
        Stack<Character> openingBrackets = new Stack<>();
        for (Character current : word.toCharArray()) {
            if (brackets.containsKey(current)) {
                openingBrackets.push(current); // Adding opening bracket
            } else {
                if (
                    openingBrackets.isEmpty()) return false;
                    char key = openingBrackets.pop();
                    if (brackets.get(key) != current) return false;
            }
        }
        return openingBrackets.isEmpty();
    }
}
