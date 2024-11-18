import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        System.out.println(sol.reverseInt(1534236469));
    }
}

class Solution {
    // - number can be negative or positive
    // -> (231) => (132)
    // - (-90) => -09

    // Solution 
    // 1. Create a function to reverse a String (Absolue (number)) => reversedString
    // 2. return the reversed string as a casted intege


    public int reverse (int number) {
        try {
            String stringNumber = String.valueOf(Math.abs(number)); 
            String reversedString = "";
            Stack<Character> stack = new Stack<>(); 
            //? Reversing the string
            for (char letter : stringNumber.toCharArray()) {
                stack.push(letter);
            }
            while(!stack.isEmpty()) {
                reversedString += stack.pop(); 
            }
            return (number < 0) ? (Integer.parseInt(reversedString) * (-1)) : Integer.parseInt(reversedString); 
        } catch (Exception e) {
            return 0;
        }
    }

    public static int reverseInt (int number) {
        try {
            int reversedInt = 0;
            while (number != 0) {
                int digit = number % 10;
                reversedInt = reversedInt * 10 + digit;
                number /= 10;
            }
            if (reversedInt > Integer.MAX_VALUE || reversedInt < Integer.MIN_VALUE) {
                return 0;
            }
            return reversedInt;
        } catch (Exception e) {
            return 0;
        }
    }


}