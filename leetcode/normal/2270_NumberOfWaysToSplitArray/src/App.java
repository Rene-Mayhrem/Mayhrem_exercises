public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Solution solution = new Solution();

        int[] testCase1 = { 10, 4, -8, 7 };
        int[] testCase2 = { 2, 3, 1, 0 };
        int[] testCase3 = { 1, 1, 1, 1, 1, 1 };
        int[] testCase4 = { -1, -2, -3, -4, -5, -6 };
        int[] testCase5 = { 5, 5, 5, 5, 5 };

        System.out.println("Test Case 1: " + solution.waysToSplitArray(testCase1)); // Expected output: 2
        System.out.println("Test Case 2: " + solution.waysToSplitArray(testCase2)); // Expected output: 2
        System.out.println("Test Case 3: " + solution.waysToSplitArray(testCase3)); // Expected output: 5
        System.out.println("Test Case 4: " + solution.waysToSplitArray(testCase4)); // Expected output: 0
        System.out.println("Test Case 5: " + solution.waysToSplitArray(testCase5)); // Expected output: 4
    }
}
