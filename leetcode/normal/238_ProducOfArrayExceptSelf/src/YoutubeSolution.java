public class YoutubeSolution {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};
    Solution solution = new Solution();
    int[] products = solution.productExceptSelf(nums);
    for (int product :  products) {
      System.out.println(product);
    }
  }
}

class Solution {
  public int[] productExceptSelf (int[] nums) {
    int[] products = new int[nums.length];
    int prefix = 1, postfix = 1;
    products[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      products[i] = prefix;
      prefix = nums[i] * prefix;
    }
    for (int i = nums.length - 1; i >= 0; i--) {
      postfix *= nums[i + 1];
      products[i] = postfix * products[i]; 
    }
    return products;
  }
}
