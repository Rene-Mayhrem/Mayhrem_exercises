🧠 Problem statement (LeetCode 2273 — Find Resultant Array After Removing Anagrams):

You are given a string array words.
You should remove all strings that are anagrams of the previous string in the list, keeping only the first occurrence in each anagram group.

Return the resultant list.

Example:
Input: words = ["abba","baba","bbaa","cd","cd"]
Output: ["abba","cd"]
Explanation:
- "baba" and "bbaa" are anagrams of "abba" → remove them
- "cd" is the same as previous "cd" (anagram of itself) → remove one

# ANSWER

I think the most efficient way to perform this task is by using a frequency map

# AI

Excellent start 💪 — that’s the right direction.
Let’s go step by step as if you were explaining your reasoning in a live interview.

---

🧠 **Interviewer:**
Good — frequency maps are one of the standard approaches for comparing anagrams.

Can you tell me *how* you’d apply that idea here?
For example:

* How would you use the frequency map to compare consecutive words?
* And how could we represent it efficiently so we’re not rebuilding a full map each time?


# ANSWER

We might need to perform multiple iteration, first one
- Creating a map frequency
- Iterate the array finding all the possible anagrams related to that frequency map, we can avoid processing by checking some constraints such as word length
- Removing all those anagramas related to that word
- Then move the frequency map into another possible type of anagram
  