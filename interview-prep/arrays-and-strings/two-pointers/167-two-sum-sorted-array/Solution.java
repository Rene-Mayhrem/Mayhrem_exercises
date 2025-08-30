public class Solution {
    public int[] twoSum (int[] numbers, int target) {
        // Create 2 pointers -> left and right
        int left = 0, right = numbers.length - 1;
        // Iterate the array while left < right
        while (left < right) {
            // Create var -> sum = left + right
            int result = numbers[left] + numbers[right];
            // if result < target -> left++
            if (result < target) {
                left++;
            // if sum > target -> right--
            } else if (result > target) {
                right--;
            } else return new int[]{++left, ++right};
            // else return left, right
        }
        return new int[]{};
        // return empty

    }
}
