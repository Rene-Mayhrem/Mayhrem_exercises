Excellent. Let's move on to the next question.

***

### **Question 2: Longest Substring Without Repeating Characters**

Given a string `s`, find the length of the **longest substring** without repeating characters.

A **substring** is a contiguous sequence of characters within a string.

**Example 1:**
* **Input:** `s = "abcabcbb"`
* **Output:** `3`
* **Explanation:** The answer is "abc", with a length of 3.

**Example 2:**
* **Input:** `s = "bbbbb"`
* **Output:** `1`
* **Explanation:** The answer is "b", with a length of 1.

**Example 3:**
* **Input:** `s = "pwwkew"`
* **Output:** `3`
* **Explanation:** The answer is "wke", with a length of 3. Note that "pwke" is a subsequence and not a substring.

What are your initial thoughts on how to solve this problem?

# INITIAL APPROACH
I can think about a set, since we require no duplications, an auxiliar variable is needed too to keep track what's the max substring. Using two pointers for the creation of the sub array, both starting at index 0, and increasing right pointer in case the subarray keeps increasing, in other caase, we find a duplicate value, we move the increase the pointer left in order to move and keep looking for the subarray