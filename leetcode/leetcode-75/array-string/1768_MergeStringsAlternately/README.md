# LEETCODE EXERCISE - LEETCODE 75

## 1768. Merge Strings Alternately

### Description

You are given two strings `word1` and `word2`. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the _merged_ string.

### **Example 1: **

**Input:** word1 = "abc", word2 = "pqr"
**Output:** "apbqcr"
**Explanation:** The merged string will be merged as so:
word1: a b c
word2: p q r
**merged:** a p b q c r

### **Example 2:**

**Input:** word1 = "ab", word2 = "pqrs"
**Output:** "apbqrs"
**Explanation:** Notice that as word2 is longer, "rs" is appended to the end.
word1: a b
word2: p q r s
**merged:** a p b q r s

### ** Example 3:**

**Input:** word1 = "abcd", word2 = "pq"
**Output:** "apbqcd"
**Explanation:** Notice that as word1 is longer, "cd" is appended to the end.
word1: a b c d
word2: p q
**merged:** a p b q c d

# SOLUTION

## Intuition

Given two strings, we need to merge them by alternating characters from each string. The solution is straightforward if both strings have the same length, but they can have different lenghts. We will iterate through both strings using pointers, adding characters to the result until both pointers reach the end.

## Approach

1. Create a `StringBuilder` to store the alternated characters from both strings.
2. Create two pointers to keep track of the current position in each string.
3. Iterate both strings until both pointers reach the end of their respective strings.
4. Add elements to the `StringBuilder` if the string is not empty and increment the pointer
5. Return the `StringBuilder`

## Complexity

- **Time complexity:**
  The time complexity is O(n) where *n* is the length of the longer string, as we iterate through the strings.

- **Space complexity:**
  The time complexity is 0(1) since we are using a `StringBuilder` and a few variables.

## Code

```java
  public String mergeAlternately (String word1, String word2) {
    // ? Create a StringBuilder to efficiently build the result string
    StringBuilder completeWord = new StringBuilder();

    // ? Initialize two pointers to traverse both strings
    int p1 = 0;
    int p2 = 0;

    // ? Iterate through both strings until both pointers reach the end of their resépectives strings
    while (p1 < word1.length() || p2 < word2.length()) {
      // ? Append the current character from words if the pointer is within bounds
      if (p1 < word1.length()) completeWord.append(word1.charAt(p1));
      if (p2 < word2.length()) completeWord.append(word2.charAt(p2));
      p1++;
      p2++;
    }
    // ? Convert the StringBuilder to a string and return it
    return completeWord.toString();
  }
```
