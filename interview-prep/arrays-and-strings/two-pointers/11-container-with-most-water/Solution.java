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

    //? input -> integers that represent different heights to form a container
    //? Find the maxArea of a container between two different heights
    //? CONSIDERATIONS:
    //? There's no negative numbers or zero -> X
    //? WHAT WE NEED?:
    //? 1. Looking for the maxArea between two x-axis in the array 
    //? 2. area = a * b
    //? 3. (a)? -> Considering that we have x1 and x2 -> Min value between x1 and x2 -> 6 & 8
    //? 4, (b)? -> Distance between index of x1 and x2
    //? STEPS:
    //? Create two pointers for traversing the array -> left & right
    //? Create a maxArea variable = 0 -> we use this var to store the max area based in all the possibilites
    //? Traverse the array using left & right pointers
    //? Get b = right - left (where right = length - 1 & left = 0)
    //? Get a = Min number between left and right values
    //? Assign the greather value between current maxArea and (a * b)
    //? Move the pointers -> left & right
    public int maxArea2(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int a = right - left; //? distance between index
            int b = Math.min(height[left++], height[right--]);
            maxArea = Math.max(maxArea, (a * b));
        }
    }
}
