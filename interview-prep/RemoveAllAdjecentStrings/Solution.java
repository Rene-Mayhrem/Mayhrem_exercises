package RemoveAllAdjecentStrings;

import java.util.Stack;

public class Solution {
    public String removeAdjacentDuplicates (String word) {
        Stack<Character> result = new Stack<>();
        StringBuilder string = new StringBuilder();
        for (char current : word.toCharArray()) {
            if (result.isEmpty()) {
                result.push(current);
            } else {
                if (result.peek() != current) {
                    result.push(current);
                } else {
                    result.pop();
                }
            }
        }
        while(!result.isEmpty()) string.append(result.pop());
        return string.reverse().toString();
    }
}
