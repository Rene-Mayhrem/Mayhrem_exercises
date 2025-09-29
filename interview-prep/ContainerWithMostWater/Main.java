package ContainerWithMostWater;

public class Main {
    public int getContainerWithMostWater (int[] heights) {
        int maxArea = 0;
        int left = 0, right = heights.length - 1;
        while (left < right) {
            int base = right - left;
            int width = Math.min(heights[left], heights[right]);
            int currentArea = base * width;
            maxArea = Math.max(currentArea, maxArea);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
