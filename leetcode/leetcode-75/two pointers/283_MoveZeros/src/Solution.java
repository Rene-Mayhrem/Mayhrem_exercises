public class Solution {

  public void moveZeroes(int[] nums) {
    int lastNonZeroFound = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) nums[lastNonZeroFound++] = nums[i];
    }

    for (int i = lastNonZeroFound; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}
