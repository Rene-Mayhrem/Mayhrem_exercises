public class Solution {
  /*
    * input -> nums
    * modify the same nums array in order to move just the zeroes to the end

    * start = 0 (first element)
    * end = nums.length - 1
    * Iterate this while start < end
      * Check if nums[end] == 0 -> increase end (get to the end of the zeroes) limit 
      * else check if nums[start] == 0
        * Moves the nums[start] to the nums[end] and update both var
      * In other case, if nums[start] != 0 -> increase start

  */ 
  public void moveZeroes (int[] nums) {
    int start = 0, end = nums.length - 1;
    while (start < end) {
      if (nums[end] == 0) {
        end--;
      } else {
        if (nums[start] == 0) {
          int temp = nums[start];
          nums[start] = nums[end];
          nums[end] = temp;
        } else {
          start++;
        }
      }
    }
  }

  public void moveZeroesArray (int[] nums) {
    int left = 0, right = 1, limit = nums.length - 1;
    while (left <= limit && right <= limit) {
      if (nums[left] == 0) {
        System.out.println("L->"+nums[left]);
        System.out.println("R->"+nums[right]);
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right++;
      }
    }
  }
}
