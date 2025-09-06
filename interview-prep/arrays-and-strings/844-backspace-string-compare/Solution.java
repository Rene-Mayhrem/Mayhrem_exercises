import java.util.Stack;

public class Solution {
    //? INPUT
    //? s & t -> characters and '#' represents backspace
    //? '#' => 
    // public boolean backspaceCompare(String s, String t) {
    //     //? Use two pointers for tracking the backspaces
    //     return build(s).equals(build(t));
    // }

    // public String build(String s) {
    //     StringBuilder sb = new StringBuilder();
    //     for (char character : s.toCharArray()) {
    //         if (character == '#') {
    //             if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
    //         } else {
    //             sb.append(character);
    //         }
    //     }
    //     return sb.toString();
    // }

    public boolean backspaceCompare (String s, String t) {
        return build(s).equals(build(t));
    }

    public String build (String target) {
        Stack<Character> result = new Stack<>();
        for (char character : target.toCharArray()) {
            if (character == '#') {
                if(result.size() > 0) result.pop();
            } else {
                result.add(character);
            }
        }
        return result.toString();
    }
}
