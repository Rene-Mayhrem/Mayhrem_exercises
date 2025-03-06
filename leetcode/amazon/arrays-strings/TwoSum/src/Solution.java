import java.util.HashMap;

// ? Let's first discuss about this problem. It can be solved in O(n*n)
// ? But that's not the most ideal case, the most ideal case is the one that determines the solution by getting the most improved version
// ? Creating a hash map of the numbers could help, it doesn't matter the index so they have to be different.
// ? 1. Create an empty map of integers, where the key represent the value of index in array, and the value represents the index of that number
public class Solution {
  public int[] twoSum (int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) map.put(nums[i], i);
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (map.containsKey(diff) && i != map.get(diff)) return new int[]{i, map.get(diff)};
    }
    return new int[]{};
  }
}