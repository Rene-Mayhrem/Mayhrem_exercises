import java.util.Arrays;

public class Solution {
  public boolean canSortArray (int[] nums) {
    int[] values = Arrays.copyOf(nums, nums.length);
    int n = values.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (values[j] <= values[j + 1]) {
          continue;
        } else {
          if (
            Integer.bitCount(j) ==
            Integer.bitCount(j + 1)
          ) {
            int temp = values[j];
            values[j] = values[j + 1];
            values[j + 1] = temp;
          } else {
            return false;
          }
        }
      }
    }
    return true;
  }
}
