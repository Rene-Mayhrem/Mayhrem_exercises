# Remove the minimum

## The museum of incredible dull things

The museum of incredible dull things wants to get rid of some exhibitions. Miriam, the interior architect, comes up with a plan to remove the most boring exhibitions. She gives them a rating, and then removes the one with the lowest rating.

However, just as she finished rating all exhibitions, she's off to an important fair, so she asks you to write a program that tells her the ratings of the items after one removed the lowest one. Fair enough.

Task
Given an array of integers, remove the smallest value. Do not mutate the original array/list. If there are multiple elements with the same value, remove the one with a lower index. If you get an empty array/list, return an empty array/list.

Don't change the order of the elements that are left.

### Examples

'''

* Input: [1,2,3,4,5], output = [2,3,4,5]
* Input: [5,3,2,1,4], output = [5,3,2,4]
* Input: [2,2,1,2,1], output = [2,2,2,1]

'''

list, arrays, fundamentals

### How am I going to resolve this problem?

**Objective:** find the minimum inside an array, if there are multiples values, delete only the first one

1. Create a variable called minimum and initialized with cero (outisde the for iteration).
2. Iterate the array by elements.
3. Ask if the minimum variable is greather than the element, if its true reassign the minimum value
4. Find the value iterating the array by using index.
5. Find the minimum value.
6. Delete it from the array.
