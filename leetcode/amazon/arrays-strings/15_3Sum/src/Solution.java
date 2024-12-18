import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
  //? INPUT 
  //? OUTPUT -> All posssible triplets 
  //? SOLUTION
  //? Create a hashMap of our content
  //? Iterate element by element -> find i, starting at 0
    //? Iterate element by element > find j and k, starting by i + 1
      //? Create aux var for following operation -> -nums[i] - nums[j]  
      //? Check if hashmap contains aux variable -> add i, j and aux
  public List<List<Integer>> threeSum (int[] nums) {
    List<List<Integer>> triplets = new ArrayList<>();
    HashMap<Integer, Integer> numMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int k = -nums[i] - nums[j];
        if (numMap.containsKey(k) && k != i && k != j) triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
      }
    }
    return triplets;
  }
}
