import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.isBalanced("()"));
    }
}

class Solution {
    public static boolean isValid (String string) {
        if (string.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (Character parentheses : string.toCharArray()) {
            stack.push(parentheses);
        }
        while(!stack.isEmpty()) {
            Character openParentheses = stack.pop();
            System.out.println(openParentheses);
            switch (openParentheses) {
                case ')':
                    if (!stack.pop().equals('(')) return false;
                    break;
                case '}':
                    if (!stack.pop().equals('{')) return false;
                    break;
                case ']':
                    if (!stack.pop().equals('[')) return false;
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public boolean isBalanced (String string) {
        if (string.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        HashSet<Character> openingParentheses = new HashSet<>(Arrays.asList('(', '{', '['));
        for (Character element : string.toCharArray()) {
            if (openingParentheses.contains(element)) {
                stack.push(element);
            } else {
                if (stack.isEmpty()) return false;
                switch (element) {
                    case ')':
                        if (!stack.pop().equals('(')) return false;
                        break;
                    case '}':
                        if (!stack.pop().equals('{')) return false;
                        break;
                    case ']':
                    if (!stack.pop().equals('[')) return false;
                        break;
                    default:
                        break;
                }
            } 
        }
        return stack.isEmpty(); 
    }

    
}