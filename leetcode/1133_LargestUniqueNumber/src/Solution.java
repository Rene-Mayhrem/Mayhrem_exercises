import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
  public int largestUniqueNumber (int[] nums) {
    Arrays.sort(nums);
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num : nums) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }
    for (int i = nums.length - 1; i > 0; i--) {
      if (frequencyMap.get(nums[i]) == 1) {
        return nums[i];
      }
    }
    return -1;
  }
}
