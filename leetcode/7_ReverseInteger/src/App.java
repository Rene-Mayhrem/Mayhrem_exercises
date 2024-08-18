import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
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
        String stringNumber = String.valueOf(Math.abs(number)); 
        String reversedString = "";
        Stack stack = new Stack<>(); 
        //? Reversing the string
        for (char letter : stringNumber.toCharArray()) {
            stack.push(letter);
        }
        while(!stack.isEmpty()) {
            reversedString += stack.pop(); 
        }
        return (number < 0) ? (Integer.parseInt(reversedString) * (-1)) : Integer.parseInt(reversedString); 
    }
}