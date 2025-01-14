public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }
}

class Solution {
    public int findMin (int[] nums) {
        //? left and right for index
        int left = 0;
        int right = nums.length - 1;
        int ans = nums[0];

        if (nums.length == 1) return nums[0];

        while(left <= right) {
            if (nums[left] < nums[right]) {
                ans = Math.min(ans, nums[left]);
            }
            int mid = (left + right) / 2;

            ans = Math.min(ans, nums[mid]);
            if (nums[left] <= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid-1;
            }
        }
        return ans;
    }
}