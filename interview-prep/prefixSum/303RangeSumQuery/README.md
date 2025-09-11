# 303. Range Sum Query - Immutable

Given an integer array nums, handle multiple queries of the following type:

    Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.

Implement the NumArray class:

    NumArray(int[] nums) Initializes the object with the integer array nums.
    int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).

 

Example 1:

Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3

# Approach

nums = [-2, 0, 3, -5, 2, -1]
ranges = [0, 2], [2, 5], [0, 5]
prefixSum = [-2, -2, 1, -4, -2, -3]

range(0, 2) = 1
range(2, 5) = prefixSum(5) - prefixSum(1) = -1
range(0, 5) = prefixSum(-5) = -3

1. I need first to get prefixSum of nums array
2. Need to iterate the ranges, for the ranges we have some exclusive cases
- left = 0, in this case, we ignore left and just return 
sum = prefixSum(right)
- left > 0, in this case we will perform the following operation
sum = prefixSum(right) - prefixSum(left - 1)