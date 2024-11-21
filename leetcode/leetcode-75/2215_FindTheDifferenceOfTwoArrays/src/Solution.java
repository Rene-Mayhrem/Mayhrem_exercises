import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
  //? INPUTS -> num1, num2
  //? OUTPUT -> [[  ], []]
  /*
   *   
   * Create a function that -> returns a Set from an array of integers
   */
  public List<List<Integer>> findDifference (int[] nums1, int[] nums2) {
    return Arrays.asList(arrayToSet(nums1, nums2), arrayToSet(nums2, nums1));
  }

  private List<Integer> arrayToSet (int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums1) {
      set.add(num);
    }
    for (int num: nums2) {
      if (set.contains(num)) set.remove(num);
    }
    return new ArrayList<>(set);
  }
}
