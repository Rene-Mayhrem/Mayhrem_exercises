import java.util.HashMap;

public class Solution {
  
  //? INPUT
  //? nums -> positive, zeros, nmegative
  //? target -> positive, negative and zerp
  //? OUTPUT
  //? return indices
  //? SOLUTION 
  //? Create a hashMap of nums -> nums[i] : i (key : value)
  //? Iterate through my array
    //? Use an auxiliar var to get the remaining value by -> target - current  
    //? Check if my map contains the result of the operation and if the indices are different -> return indices array
  //? return empty array
  public int[] twoSum (int[] nums, int target) {
    HashMap<Integer, Integer> numsMap = new HashMap<>();
    //? array to hashMap
    for (int i = 0; i < nums.length; i++) numsMap.put(nums[i], i);
    for (int i = 0; i < nums.length; i++) {
      int aux = target - nums[i];
      if (numsMap.containsKey(aux) && numsMap.get(aux) != i) return new int[]{i, numsMap.get(aux)}; 
    }
    return new int[]{-1, -1};
  }
}
