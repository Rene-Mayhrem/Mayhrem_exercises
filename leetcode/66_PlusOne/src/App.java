public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Solution sol = new Solution();
        int[] values = {19, 9, 9};
        int[] result = sol.plusOne(values);
        System.out.println(result.toString());
        for (int value : result) {
            System.out.println(value);
        }

    }
}

class Solution {
    public int[] plusOne (int[] digits) {
        String numberString = "";
        for (int digit : digits) {
            System.out.println(digit);
        }
        System.out.println(numberString);
        Long number = Long.parseLong(numberString) + 1;
        System.out.println(number);
        char[] charArray = String.valueOf(number).toCharArray();
        int[] digitsPlusOne = new int[charArray.length];
        for (int i = 0; i < digitsPlusOne.length; i++) {
            digitsPlusOne[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }
        return digitsPlusOne;
        
    }
}