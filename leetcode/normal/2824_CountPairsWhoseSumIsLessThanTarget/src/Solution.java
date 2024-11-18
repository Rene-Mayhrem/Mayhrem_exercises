import java.util.Collections;
import java.util.List;

public class Solution {
  public int countPairs (List<Integer> nums, int target) {
    /* 
     * Sort elements
     * Initialize i = nums.get(0)
     * countPairs = 0
     * Iterate through the nums array
      * Check if the element is less than target
        * int j = i + 1;
        * Iterate nums array while j < nums.length && element < target
          * if (element[i] + element[j] < target)
     */
    Collections.sort(nums);
    int i = 0, countPairs = 0;
    while (i < nums.size()) {
      System.out.println("i->"+nums.get(i));
      if (nums.get(i) < target) {
        int j = i + 1;
        while (j < nums.size()) {
          System.out.println(j);
          System.out.println("x -> "+(nums.get(i) + nums.get(j)));
          if (nums.get(i) + nums.get(j) < target) {
            System.out.println("i, j -> "+i+" "+j+"-> ["+(nums.get(i) + nums.get(j))+"]="+target);
            countPairs++;
          } 
          j++;
        }
        i++;
      }
      i = nums.size();
    }
    return countPairs;
  }
}
