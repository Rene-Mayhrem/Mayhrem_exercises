public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        System.out.println(new Solution().mergeAlternately("abcd", "pqr")); // "apbqcrd"
        System.out.println(new Solution().mergeAlternately("ab", "pqrs")); // "apbqrs"
        System.out.println(new Solution().mergeAlternately("abcd", "pq"));
    }
}
