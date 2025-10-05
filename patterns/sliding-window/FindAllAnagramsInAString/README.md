Perfect 🔥 — LeetCode **438. Find All Anagrams in a String** is *exactly* the kind of problem companies like Amazon and Google love to test: it’s a mix of **hash maps, character frequency tracking, and sliding window** logic.

Let’s simulate the interview from scratch.

---

### 🎯 Interview Simulation:

**You’re in a 45-min Amazon-style technical interview.**
I’ll be your interviewer.

---

🧠 **Interviewer:**
Let’s move on to a new question.

You’re given two strings, `s` and `p`.
You need to **find all the start indices of `p`’s anagrams in `s`**.
Return the result as a list of integers.

#### Example:

```
Input: s = "cbaebabacd", p = "abc"
Output: [0, 6]
Explanation:
The substring starting at index 0 ("cba") is an anagram of "abc".
The substring starting at index 6 ("bac") is also an anagram of "abc".
```

---

🗣️ **Constraints:**

* Both `s` and `p` contain only lowercase English letters.
* `1 <= s.length, p.length <= 3 * 10^4`

---

**Question 1 (conceptual):**
Before we write code, can you explain how you’d approach this problem?
Specifically — how can you efficiently determine if a substring of `s` is an anagram of `p`, *without* sorting or re-checking all characters every time?

# APPROACH

I'll create a frequency map based on my string p. I this way I'll the number of occurrences every character has. In adition of this, I'll create a sliding window to increase the subarray. If the character is not on my map, I just adjust the subarray from my left pointer to my right + 1 position. In case my two maps are the same, I'll return the value of left and then move it.

# Interviewer (follow-up):
Good — you’re thinking in the right direction.

Let’s refine your plan.

If you maintain two hash maps — one for p and one for the current window in s — how can you make sure that comparing them doesn’t take O(26) every time?
That is, what optimization can you introduce so that the window slides in O(n) overall, not O(26n)?

# ANSWER
To make sure there's no O(26n) operantion in every iteration, is needed to create the map of character as key and number of occurencies as value, in this way, the operation would be O(1) but based on a number of n lenght, it is O(n).

# Follow-up:
You’re right that by updating counts in-place, each operation on the map can be done in O(1).

But there’s still a subtlety:
Even if you update in O(1), how do you know when the two maps (for p and the current window in s) are equal — without comparing all 26 entries every time?

Because even if you use a HashMap<Character, Integer>, comparing them directly at each step still takes O(26).

So — what trick can you use to know the maps match in constant time as you slide the window?

(Hint: think about maintaining a single counter that tracks how many characters currently match.)

# ANSWER
The best way to keep track that the maps are exactly the samae, is by using a counter which is the lenght of my p.length. Every time a characters match the character and the number of occurrences, I'll increase the counter auxiliar variable. 