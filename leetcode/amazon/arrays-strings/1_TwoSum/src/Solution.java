import java.util.HashMap;

public class Solution {
  
  public int[] twoSum (int[] nums, int target) {
    HashMap<Integer, Integer> numMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) numMap.put(nums[i], i);
    for (int i = 0; i < nums.length; i++) {
      int targetMap = target - nums[i];
      if (numMap.containsKey(targetMap) && numMap.get(targetMap) != i) return new int[]{i, numMap.get(targetMap)};
    }
    return null;
  }

  
  // ? 1. Create a array of int -> length 2
  // ? 2. Create a hashMap from the nums array -> <nums[i], i>
  // ? 3. Iterate my nums array
  //   ? 3.1 Create a var called diff = target - nums[i]
  //   ? 3.2 Check if my map contains that key (diff) -> means there is a value to sum 
  // ? 3.2 Return empty array 
  public int[] twoSumPractice (int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length - 1; i++) map.put(nums[i], i);
    for (int i = 0; i < nums.length - 1; i++) {
      int diff = target - nums[i];
      if (map.containsKey(diff) && i != map.get(diff)) {
        return new int[]{i, map.get(diff)};
      }
    }
    return new int[2];
  }
}
