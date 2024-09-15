import java.util.HashSet;
import java.util.Set;

public class AnotherSolution {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 1};
    Solution solution = new Solution();
    System.out.println(solution.containsDuplicate(nums));
  }
}

class Solution {
  public boolean containsDuplicate (int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) return true;
      set.add(num);
    }
    return false;
  }
}
