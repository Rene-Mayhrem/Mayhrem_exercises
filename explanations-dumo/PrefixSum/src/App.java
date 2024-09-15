public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] values = {1, 3, 6, 10, 15};
        int[] prefixSum = new Dump().getPrefixSum(values);
        for (int value : prefixSum) {
            System.out.println(value);
        }
    }
}

class Dump {
    public int[] getPrefixSum (int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        return prefixSum;
    }
}