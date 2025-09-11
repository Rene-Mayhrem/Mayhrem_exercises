# 1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

# APPROACH

The way to get the prefixSum:
1. It's the same lenght of the array nums
2. The first element is the same than the array nums 
3. The ith after the index 1 is: prefixSum(i - 1) + nums[i]

After having this considerations, I'd describe the process as creating the prefixSum array the same lenght arrays Nums.
I'll assign the first element of prefixSum[0] = nums[0]
Then I'll start iterating the nums array starting from index 1 to the last item
The operation inside the for loop would be
prefixSum[i] = prefixSum[i - 1] + nums[i]

and the for condition would be (i = 1; i < nums.length; i++)

```java
public int[] runningSum (int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        return prefixSum;
    }
```