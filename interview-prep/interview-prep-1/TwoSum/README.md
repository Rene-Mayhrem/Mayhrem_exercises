Excellent. Let's move on to the next question.

***

### **Question 4: Two Sum**

Given an array of integers `nums` and an integer `target`, return **indices** of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may not use the *same* element twice.

**Example 1:**
* **Input:** `nums = [2, 7, 11, 15]`, `target = 9`
* **Output:** `[0, 1]`
* **Explanation:** Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

**Example 2:**
* **Input:** `nums = [3, 2, 4]`, `target = 6`
* **Output:** `[1, 2]`

**Example 3:**
* **Input:** `nums = [3, 3]`, `target = 6`
* **Output:** `[0, 1]`

What are your initial thoughts on how to approach this problem?

# APPROACH

I'm thinking about two-pass and creating a map of the elements, where we have the key as the number, and the value as the index - first pass. The creation of the map is necessary to retrieve faster the target by performing the operation `total = target - nums[i]`, then if we retrieve successfully a value, we return both indices. As the conditions say, there's exactly one solution. This will perform a solution with O(n) of time and space complexity.