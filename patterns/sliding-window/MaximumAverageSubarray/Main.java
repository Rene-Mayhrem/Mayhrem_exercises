
public class Main {
    public double getMaxAverageSubarray (int[] nums, int k) {
        //? First calculate the sum of the 'k' elements
        int currentSum = 0;
        for (int i = 0; i < k; i++) currentSum += nums[i];
        //? Create an aux variable
        double maxAvg = (double) currentSum / k;
        //? Use sliding window approach
        int right = k;
        int left = 0;
        while (right < nums.length) {
            currentSum += nums[right++] - nums[left++];
            maxAvg = Math.max(maxAvg, (double) currentSum / k);
        }
        return maxAvg;
    }

    public double MaxSumSubarray (int nums[]) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        //? Use of pointer to create the pointers
        int left = 1;
        int right = 1;
        while (right < nums.length) {
            //? Check if the current sum is greather than the current element
            if ((currentSum + nums[right]) >nums[right]) {
                currentSum += currentSum + nums[right++];
            } else {
                currentSum = nums[left++];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    //? 
}