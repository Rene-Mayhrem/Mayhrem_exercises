Awesome. Let's dive into that. This is a classic problem that really shows the power of prefix sums when combined with another data structure.

The problem is: Given an array of numbers and a target value k, can you find a subarray that adds up to k?

Let's start with a simple example: nums = [1, 2, 3] and our target k = 3.

Before we get to any tricks, how would you find a subarray that adds up to 3 using a basic, straightforward approach? What are all the possible subarrays and their sums?

# Initial approach

As an initial approach, I'll be using sliding windows, since we want to create subarrays. I'll maybe store my subarrays in a set so in this way I'll know which subarrays are already considered in and I'd won't have any duplicates. In this case with the sliding window pattern my object is to create subarrays with the same value than k 

if nums = [1, 2, 3] and k = 3

totalCount = 0
prefixSum = [1, 3, 6]
currentSum = 0
sumCounts = {
    0: 1,
    1 : 0,
    3 : 0,
    6 : 0
}

1st iteration i = 0 nums[i] = 1
currentSum = 0 + 1 = 1
neededSum = currentSum - 3 = -2
sumCounts.get(-2) doesn't exist
totalCount = 0

2nd iteration i = 1 nums[1] = 2
currentSum = 1 + 2 = 3
neededSum = currentSum - 3 = 0
sumCounts.get(0) doesn't exist
totalCount = 0

3rd iteration
currentSum = 3 + 3 = 6
neededSum = 6 - 3 = 3
sumCounts.get(3) does exist
sumCounts = {
    1 : 0,
    3 : 0 + 1,
    6 : 0
}
totalCount = 0 + 1 = 1
