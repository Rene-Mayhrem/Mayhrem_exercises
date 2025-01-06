# 143. Kids with the greatest number of candies

## Problem statement:

There are `n` kids with candies. You are given an integer array `candies`, where each `candies[i]` represents the number of candies the `ith` kid has, and an integer `extraCandies`, denoting the number of extra candies that you have.

Return a boolean array result of length n, where `result[i]` is true if, after giving the `ith` kid all the `extraCandies`, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

### Example 1:

**Input:** candies = [2,3,5,1,3], extraCandies = 3
**Output:** [true,true,true,false,true] 
**Explanation:** If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

### Example 2:

**Input:** candies = [4,2,1,1,2], extraCandies = 1
**Output:** [true,false,false,false,false] 
**Explanation:** There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.

### Example 3:

**Input:** candies = [12,1,12], extraCandies = 10
**Output:** [true,false,true]

 

**Constraints:**

    `n == candies.length`
    `2 <= n <= 100`
    `1 <= candies[i] <= 100`
    `1 <= extraCandies <= 50`

## Solution

### Intuition

As we read through the problem, we identify the variables and how they interact with each other. The problem statement tells us that we need to find the highest value in the `candies` array without adding any extra candies. Then, we must create a list of booleans where each boolean indicates if the current number of candies plus the extra candies is equal to or greater than the maximum value in the `candies` array.


### Approach

1. Create a variable `maxCandies` to hold the maximum number of candies any kid currently has.
2. Iterate over the `candies` array to find the maximum number of candies.
3. Create a list of booleans to determine if each kid can have the greatest number of candies after receiving the extra candies.

### Complexity

- **Time complexity:**: `O(n)` - We iterate through the `candies` array twice, which results in a linear time complexity.

- **Space complexity:** `O(n)` - We create a list of booleans with the same length as the candies array

### Code

```java
public List<Boolean> kidsWithCandies (int[] candies, int extraCandies) {
    //? Initialize maxCandies to keep track of the highest number of candies any kid currently has
    int maxCandies = 0;
    List<Boolean> result = new ArrayList<>();
    //? Find the maximum number of candies any kid has in the array of candies
    for (int candy : candies) maxCandies = Math.max(maxCandies, candy);
    //? Determine if each kid can have the greatest number of candies after receiving extra candies
    for (int candy : candies) result.add((extraCandies + candy) >= maxCandies);
    return result;
  }
```
