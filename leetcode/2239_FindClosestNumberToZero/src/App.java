public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Solution {
    public int findClosestNumber(int[] nums) {
        //? Creating min to compare and to find closest - with abs and not have any problems with negative and positive numbers
        int min = Math.abs(nums[0]);
        //? Using this variable to return the index in case of having positive and negative numbers, return the largest value.
        int auxIndex = 0;
        //? We start with the second value, due to the initial conditions
        for (int i = 1; i < nums.length; i++) {
            // * In case of having positive and negative numbers, return the index of the largest
            if (Math.abs(nums[i]) == min) {
                if (nums[i] > 0) {
                    auxIndex = i; // ! The largest to me, means the positive
                }
            //? There are different numbers
            } else if (Math.abs(nums[i]) < min) {
                min = Math.abs(nums[i]);
                auxIndex = i;
            }
        }
        return nums[auxIndex];
    }
}