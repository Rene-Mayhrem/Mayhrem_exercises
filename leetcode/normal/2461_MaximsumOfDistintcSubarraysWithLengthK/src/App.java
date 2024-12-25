public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // int[] nums = {1, 5, 4, 2, 9, 9, 9};
        // int[] nums = {1, 1, 1, 7, 8, 9};
        int[] nums = {5, 3, 3, 1, 1};
        System.out.println(new Solution().getMaximumubarraySum(nums, 3));
    }
}
