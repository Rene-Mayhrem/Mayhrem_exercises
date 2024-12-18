public class Solution {
  // Given an integer array nums, find the
  // subarray
  // with the largest sum, and return its sum.

  // Example 1:

  // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
  // Output: 6
  // Explanation: The subarray [4,-1,2,1] has the largest sum 6.
  // Example 2:

  // Input: nums = [1]
  // Output: 1
  // Explanation: The subarray [1] has the largest sum 1.
  // Example 3:

  // Input: nums = [5,4,-1,7,8]
  // Output: 23
  // Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

  //? INPUT ->
  //? OUTPUT -> max sum of subarray
  //? SOLUTION 
  //? Create a variable for finding maxSum = 0
  //? Iterating through my array by indices -> i = 0
    //? Create an auxiliar variable -> aux = i = 1;
    //? Create a variable sum = 0
    //? Iterate while aux < nums.length
     //? Sum values to the current sum
     //? Reaassign maxSum with the current sum and the max sum
     //? Move the pointer aux
  //? return maxSum
  public int getMaxSubarray (int[] nums) {
    int maxSum = nums[0];
    int currentSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (currentSum < 0) currentSum = 0;
      currentSum += nums[i];
      maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
  }
       
}
