Certainly! That's another classic and excellent problem for a Google interview. It tests your use of the **Sliding Window** technique and **Hash Sets/Maps** for optimal $O(n)$ performance.

## New LeetCode Challenge: Longest Substring Without Repeating Characters

Given a string `s`, find the length of the **longest substring** without repeating characters.

---

### Example

| Input String (`s`) | `"pwwkew"` |
| :--- | :--- |
| **Output** | `3` |
| **Explanation** | The longest substring without repeating characters is `"wke"`, with a length of 3. Note that `"pwke"` is a subsequence and not a substring. |

---

### Step 1: Brute Force

The brute-force approach involves checking the uniqueness of **every possible substring** in the input string `s`.

1.  How many substrings are there in a string of length $N$?
2.  What is the time complexity of checking if a single substring has unique characters?
3.  What is the resulting total time complexity for the brute-force solution? 🧠

### Hint

A string of length $N$ has $O(N^2)$ substrings. The time complexity for checking uniqueness will dominate the overall time.

## Initial Approach

The use of a set is here important beacuse its properties and that doesn't allow us to have duplicate elements, so iterating by using nested loops and storing characters while the set doesn't contain any of that chars. Return the final size of the set