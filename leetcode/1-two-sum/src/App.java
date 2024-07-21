public class App {


    // ? DESCRIPTION
    // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    // You may assume that each input would have exactly one solution, and you may not use the same element twice.
    // You can return the answer in any order.

    // Example 1:
    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]
    // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    // Example 2:
    // Input: nums = [3,2,4], target = 6
    // Output: [1,2]
    // Example 3:
    // Input: nums = [3,3], target = 6
    // Output: [0,1]


    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] nums = {3, 2, 4};
        int[] targets = solution.twoSum(nums, 6);
        for(int target: targets) {
            System.out.println("Target: "+target);
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //? auxiliar variables 
        int[] index_targets =  new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    int sum = nums[i] + nums[j];
                    if(target == sum) {
                        index_targets[0] = i;
                        index_targets[1] = j;
                        return index_targets;
                    }
                }
            }
        }
        return index_targets;
    }
}