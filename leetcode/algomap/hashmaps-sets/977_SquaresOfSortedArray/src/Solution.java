import java.util.Arrays;
import java.util.Collections;

public class Solution {
  // ? INPUT
  // * Array of integers -> they can be negative, zero or positive
  // ? OUTPUT
  // * Sorted array of squares of every value
  // ? Solution
  // * Get sqaure of every unsorted element (negative number square times are
  // positives)
  // * Sort the array of nums

  public int[] sortedSquares(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) Math.pow(nums[i], 2);
    }
    Arrays.sort(nums);
    return nums;
  }
}
