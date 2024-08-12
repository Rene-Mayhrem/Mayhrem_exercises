public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Solution {
    public int findClosestNumber (int[] nums) {

        int min = Math.abs(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < min) {
                min = Math.abs(nums[i]);
            }
        }

        return min;
    }
}