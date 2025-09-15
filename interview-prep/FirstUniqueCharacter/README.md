

**Problem 387:** Given a string `s`, find the first non-repeating character in it and return its index. If it does not exist, return -1.

**Example:**
* `s = "leetcode"` should return `0`.
* `s = "loveleetcode"` should return `2`.
* `s = "aabb"` should return `-1`.

What's your initial approach to solving this?

# INITIAL APPROACH

PARAMETER: it only contains english letters

VARIABLES:
- Array: 26-size array, every index represents the position of the letter in the alphabet

CODE LOGIC:
- Create an array with 26-size 0's
- First pass (O(n)): Fill the array with the number of occurences with the operation: char - 'a'. We are using characters since it's ASCII values, so this operation guarantee the value is between our limits 0-25. The operation for the frequecy would be current value + 1 -> O(1)
- Second pass O(n): Iterate the string and use the frequency alphabet looking for value of 1, by getting the index by -> char - 'a', if value at index 1, return the current loop index

RETURN
- The value by a letter is 1, return the current index
- After looping, no value found, return -1

