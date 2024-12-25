import java.util.HashSet;

public class Solution {
  // You are given an integer array nums and an integer k. Find the maximum
  // subarray sum of all the subarrays of nums that meet the following conditions:

  // The length of the subarray is k, and
  // All the elements of the subarray are distinct.
  // Return the maximum subarray sum of all the subarrays that meet the
  // conditions. If no subarray meets the conditions, return 0.

  // A subarray is a contiguous non-empty sequence of elements within an array.

  // Example 1:

  // Input: nums = [1,5,4,2,9,9,9], k = 3
  // Output: 15
  // Explanation: The subarrays of nums with length 3 are:
  // - [1,5,4] which meets the requirements and has a sum of 10.
  // - [5,4,2] which meets the requirements and has a sum of 11.
  // - [4,2,9] which meets the requirements and has a sum of 15.
  // - [2,9,9] which does not meet the requirements because the element 9 is
  // repeated.
  // - [9,9,9] which does not meet the requirements because the element 9 is
  // repeated.
  // We return 15 because it is the maximum subarray sum of all the subarrays that
  // meet the conditions
  // Example 2:

  // Input: nums = [4,4,4], k = 3
  // Output: 0
  // Explanation: The subarrays of nums with length 3 are:
  // - [4,4,4] which does not meet the requirements because the element 4 is
  // repeated.
  // We return 0 because no subarrays meet the conditions.
  //? INPUT -> 
  //? OUTPUT -> Max sum in all the subarrays
  //? SOLUTION
  //? Create maxSum -> to keep track of the maximum sum in all our available subarrays
  //? Create initial pointer for first elements -> start
  //? Create a hashSet to store elements and satisfy the following condition -> all elements are distinct
  //? Move while end < (nums.length - k) -> Iterate first value and move elements
    //? Create end variable to use as the second pointer => end = start
    //? Create a var for currentSum -> 
    //? While (begin < k) iterate and create the add elements to the hashSet
      //? Check if set contains value at index end -> currentSum = 0 && end = k (ends iteration)
      //? In other case -> increase end, add elements to the set and add the element to the current sum
    //? Clear set for new values
    //? Check max value in currentSum and maxSum
  //? Return maxSum
  public long getMaximumubarraySum(int[] nums, int k) {
    long maxSum = 0;
    int start = 0;
    long currentSum = 0;
    int end = 0;
    HashSet<Integer> subarray = new HashSet<>();
    while (start <= (nums.length - k)) {
      System.out.println("--->"+start);
      System.out.println(nums[start]);
      System.out.println(nums.length - k);
      end = start;
      currentSum = 0;
      for (int i = 0; i < k && end < nums.length; i++) {
        if (subarray.contains(nums[end])) {
          currentSum = 0;
          end = k;
        } else {
          currentSum += nums[end];
          subarray.add(nums[end]);
          end++;
        }
      }
      System.out.println(subarray);
      start++;
      if (subarray.size() == k) maxSum = Math.max(currentSum, maxSum);
      subarray.clear();
      
    }
    return maxSum;
  }

}
