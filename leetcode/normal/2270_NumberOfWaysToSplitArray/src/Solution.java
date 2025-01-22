public class Solution {
  // ? INPUT 
  // * Array of integeres -> negativa, zero or positive
  // ? OUTPUT 
  // * Return the number of valid splits according to the following rules
  // * left and right has at least one element of the array
  // * left sub array sum is greather than right subarray sum
  // ? SOLUTION
  // * Create a counter variable for valid splits initialized with 0
  // * Iterate over the array starting in index 0 to the last second element in the array n - 2
  // * Get the sum of the left side and get the sum of the right side
  // * Sum 1 if left >= right else sum 0
  // * return the auxiliar variable for valid splits
  // public int waysToSplitArray (int[] nums) {
  //   int validSplits = 0;
  //   for (int i = 0; i < nums.length - 1; i++) {
  //     int leftSum = 0;
  //     int rightSum = 0;
  //     int left = i;
  //     int right = i + 1;
  //     while (left >= 0 || right < nums.length) {
  //       leftSum = (left >= 0) ? + nums[left] : + 0;
  //       rightSum = (right < nums.length) ? + nums[right] : +0;
  //       left--;
  //       right++;
  //     }
  //     if  (leftSum > rightSum) validSplits++;
  //   }
  //   return validSplits;
  // }
  public int waysToSplitArray (int[] nums) {
    int validSplits = 0;
    long totalSum = 0;
    //! Get the total sum of the array
    for (int num : nums) totalSum += num;
    long leftSum = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      leftSum += nums[i];
      long rightSum = totalSum - leftSum;
      if (leftSum >= rightSum) validSplits++;
    }
    return validSplits;
  }
}
