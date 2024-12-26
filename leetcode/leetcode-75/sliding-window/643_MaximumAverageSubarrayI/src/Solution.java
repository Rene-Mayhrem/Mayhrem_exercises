public class Solution {
  public double findMaxAverage (int[] nums, int k) {
    double maxAverage = Double.NEGATIVE_INFINITY;
    for (int i = 0; i <= nums.length - k; i++) {
      int counter = 0, sum = 0; 
      System.out.println(counter);
      while (counter < k && counter < nums.length) {
        System.out.println(nums[counter + i]);
        sum += nums[counter + i];
        counter++;
      }
      maxAverage = Math.max(maxAverage, sum);
    }
    return maxAverage / k;
  }
}
