import java.util.Arrays;

public class YoutubeSolution2 {

}

class Solution {
  public int[] productExceptSelf(int[] nums) {
    int[] products = new int[nums.length];
    Arrays.fill(products, 1);
    int prefix = 1, postfix = 1;
    products[0] = 1;
    for (int i = 0; i < nums.length; i++) {
      products[i] = prefix;
      prefix = nums[i] * prefix;
    }
    for (int i = nums.length - 1; i >= 0; i--) {
      products[i] = postfix * products[i];
      postfix = postfix * nums[i];
    }
    return products;
  }
}