Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

 

Constraints:

    1 <= nums.length <= 105
    -109 <= nums[i] <= 109

We want this solution to be space complexity O(1) and time complexity O(n)

## Approach

Creating a set and the fill the set with the characters in the string:
Time space O(n), because we are iterating the string by analizing character by character
Space complexity O(n) since we are using the set, the set will increase in the worst case, n

## Another approach

1. Creating a alphabet dictionary of boolean. Since we know every character has an ASCII value represented by int -> Creating a fixed-26 array of boolean that keep tracking of all the appeared characters in the string -> false
2. Format the string in order to clear the non-alphanumerical characters, case-sensitivy
3. Iterate the string and analyzing every character by getting the int value in ASCCII format -> We need to set a math rule to get the index of that letter in the array
4. Check the current value of the array at the index -> index represent the place of the letter in the alphabet
5. Return true if the value at that index is true
6. Set value at current index as true in order to indicate that letter has appeared once in the string
8. After traversing the strings without any return statement, return false, since it represents the string doesn't contain any duplicate values

Time complexity O(n)
Space complexity O(1) since it is a fixed-size array of 26 elements