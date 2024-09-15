public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // int[] nums = {-1, 1, 0, -3, 3};
        int[] nums = {1, 2, 3, 4};
        Solution solution = new Solution();
        int[] products = solution.productExceptSelf(nums);
        for (int product : products) {
            System.out.println(product);
        }
    }
}

class Solution {
    public void showArray (int[] arr) {
        for (int element : arr) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public int[] productExceptSelf (int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] products = new int[nums.length];
        prefix[0] = 1;
        postfix[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }
        for (int i = nums.length - 2; i > 0; i--) {
            postfix[i] = postfix[i - 1] * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            products[i] = postfix[i] * prefix[i];
        }
        showArray(prefix);
        showArray(postfix);
        return products;
    }
}