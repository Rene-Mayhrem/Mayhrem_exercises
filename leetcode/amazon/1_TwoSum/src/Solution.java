import java.util.HashMap;

public class Solution {
  public int[] twoSum (int[] nums, int target) {
    int[] result = new int[2];
    HashMap<Integer, Integer> numMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) numMap.put(nums[i], i);
    for (int i = 0; i < nums.length; i++) {
      int targetMap = target - nums[i];
      System.out.println(targetMap);
      if (numMap.containsKey(targetMap) && numMap.get(targetMap) != i) return new int[]{i, numMap.get(targetMap)};
    }
    return result;
  }
}
