public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Solution {
    public int maxProduct (int[] nums) {
        if (nums.length == 0) return 0;
        int min = nums[0];
        int max = nums[0];
        int result = max;
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int temp = Math.max(current, Math.max(max*current, min*current));
            min = Math.min(current, Math.min(max*current, min*current));
            max = temp;
            result = Math.max(result, max);
        }
        return result;
        
    }
}
