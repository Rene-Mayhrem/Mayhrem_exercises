public class App {

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(-121));
    }
}


class Solution {
    public boolean isPalindrome (int number) {
        String castedNumber = String.valueOf(number);
        char[] numberToArray = castedNumber.toCharArray();
        String reversedString = "";
        for(int i = numberToArray.length - 1; i >= 0; i--) {
            reversedString += numberToArray[i];
        }
        return reversedString.equals(castedNumber);
    }
}