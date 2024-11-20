import java.util.HashSet;

public class Solution {
  /*
   * 1. Create a maxSum -> aux variable to find the max value 
   * 2. Create a Set of integers to create the subarrays
   * 3. Iterate my array element by element
    * Start adding element to the set until there's a duplicated value 
    * Update the max value 
    * Empty the set 
   */
  public long maximumSubarraySum (int[] nums, int k) {
    int maxSum = 0;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      int subarraySum = 0;
      for (int c = 0; c < k; c++) {
        if ((i + c) < nums.length) {
          set.add(nums[i + c]);
          subarraySum += nums[i+c];
        }
      }
      System.out.println(set);
      if (set.size() == k) {
        maxSum = Math.max(maxSum, subarraySum);
      } else {
        subarraySum = 0;
      }
      set.clear();
    }
    return maxSum;
  }
}
