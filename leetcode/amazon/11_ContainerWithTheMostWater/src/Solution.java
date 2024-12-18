public class Solution {
  //? INPUT -> 
  //? OUTPUT -> maximum area -> rectangle area -> (num[i] + num[j]) * base 
  //? SOLUTION
  //? left and right => 0 and height.length - 1
  //? Iterate through the array
    //? Get a -> min value between height[left] and height[right]
    //? Get b -> abs value of height[left] - height[right]
    //? Get the max value between current max and the result of (a * b)
    //? Move pointer of the min height
  public int maxArea (int[] height) { 
    int start = 0;
    int end = height.length -1;
    int maxArea = 0;
    while (start < end) {
      int a = Math.min(height[start], height[end]);
      int b = Math.abs(start - end);
      maxArea = Math.max(maxArea, (a * b));
      if (height[start] < height[end]) {
        start++;
      } else {
        end--;
      }
    }
    return maxArea;
  }
}
