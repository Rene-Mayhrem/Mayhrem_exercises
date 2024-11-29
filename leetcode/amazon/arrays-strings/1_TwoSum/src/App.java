public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {3, 2, 4};
        int[] res = new Solution().twoSum(nums, 6);
        for (int val : res) System.out.println(val);
    }
}
