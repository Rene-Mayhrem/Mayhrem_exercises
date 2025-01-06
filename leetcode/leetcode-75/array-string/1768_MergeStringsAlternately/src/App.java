public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        // Test case 1
        String result1 = solution.mergeAlternately("abc", "pqr");
        System.out.println("Test case 1: " + result1); // Expected: "apbqcr"

        // Test case 2
        String result2 = solution.mergeAlternately("ab", "pqrs");
        System.out.println("Test case 2: " + result2); // Expected: "apbqrs"

        // Test case 3
        String result3 = solution.mergeAlternately("abcd", "pq");
        System.out.println("Test case 3: " + result3); // Expected: "apbqcd"

        // Test case 4
        String result4 = solution.mergeAlternately("", "pqrs");
        System.out.println("Test case 4: " + result4); // Expected: "pqrs"

        // Test case 5
        String result5 = solution.mergeAlternately("abcd", "");
        System.out.println("Test case 5: " + result5); // Expected: "abcd"
    }
}
