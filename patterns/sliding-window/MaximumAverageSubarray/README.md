643. Maximum Average Subarray I

You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Example 2:

Input: nums = [5], k = 1
Output: 5.00000

 

Constraints:

    n == nums.length
    1 <= k <= n <= 105
    -104 <= nums[i] <= 104

# Initial approach
This problem can be solved by using sliding window, since we need to create a contiguous subarray with length 'k', the type of sliding window is a fixed-size. In addition of th sliding window technique, it is necessary to use a variable to store the maxAverage. 

# Steps
- Create a variable called maxAvg = 0 -> Auxiliar variable to keep track of the max average in the array
- Create two pointers; left = 0 and right = left -> we move the fast pointer to form the subarray, then we move the pointer
- Iterate while the condition is left < nums.length
- Then it might be necessary to use a new nested loop where the conditions are -> i < k && i < nums.length
- Create a var for current sum in every iteration and the just get the avg of current sum / k

# AI ANSWER

Your plan currently recomputes the sum for each subarray, right? That’s potentially O(n·k).
Do you think we can make it more efficient — ideally O(n) — without recalculating the full sum each time?

# REPLY

Indeed, that's by recalculating all sum for any subarray. Thanks for noticing, I think once you have mentioned it. We could just calculate the sum of the whole array the first iteration, and then we can just add the last element, and substract the last element, like in a queue, without using a queue, in this way, the operation wouldn't be O(n*k)

- **Time space:** O(n)
- **Space complexity:** O(1)

# Interviewer follow-up question (realistic next step):

Nice job. Could you tell me how you’d handle the same problem if instead of the maximum average, I asked for the maximum sum subarray of variable length — meaning k is not fixed?

This is a sliding window → Kadane’s algorithm transition question (a common Google-style next step).
Would you like to simulate that follow-up now?

# REPLY

The use of sliding windows is still de best option, but I think the approach must change, in this case. I'll start by getting the currentSum and the maxSUm which corresponds to the first element. Then we need to update the value of currentSum based on what's biggeer, the currentSu or the element itself, then we need to update the value of maxSum
```java
    public double MaxSumSubarray (int nums[]) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(maxSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
```

# AI ANSWER
Follow-up Question (interviewer level-up):

Great — what if I now asked for not just the sum, but also the start and end indices of the subarray with the maximum sum?

👉 How would you modify your code to also return the subarray boundaries?
(You can think out loud — no need to write perfect code right away.)

# REPLY
The use of pointer in this case is totally needed. I'll start by creating the pointer start and end. And the modify of the code is also needed. I'll change the for for the while and move the pointers by the condition of currentsum and current element
```java
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
```