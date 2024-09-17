public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(nums));
    }
}

class Solution {
    public int maxSubArray (int[] nums) {
        int currrentSum = 0;
        int maxSum =  nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (currrentSum < 0) {
                currrentSum = 0;
            }
            currrentSum += nums[i];
            maxSum = Math.max(currrentSum, maxSum);
        }
        return maxSum;
    }
}
