public class Solution {
    public int maxArea (int[] height) {
        // Create left and right pointers
        // Create a maxArea variable
        // Iterate the array while left < right

        // Rectangle -> maxArea -> (base * altitude) 
        // base = right - left
        // altitude = minimum value between pointer left and pointer right
        // left = 6 & right = 8
        // rectangle's area = width * height = b * a
        // b => right - left
        // a => Math.min(left, right)

        int left = 0, right = height.length - 1, maxArea = 0;
        while (left < right) {
            int b = right - left;
            int a = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, (a * b));
            
            while (left < right && height[left] <= a) left++;
            while (left < right && height[right] <= a) right--;
        }
        return maxArea;
    }
}
