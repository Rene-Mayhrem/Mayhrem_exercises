# MAYHREM EXERCISES SOLUTIONS

> Date: Saturday, August 26th, 2023.

| problem        | platofrm   |
| -------------- | ---------- |
| FirstDuplicate | CodeSignal |

## Instructions

Given an array `a` that contains only numbers in the range from `1 to a.length`, find the first duplicate number for which the second occurence has the minimal index. In other words, if there are more than 1 duplicate number, return the number for which the second occurence has a smaller index than the second occurence of the other number does. If there are no such elements, return `-1`.

## Example

- For a = [2, 1, 3, 5, 3, 2], the output should be solution(a) = 3. There are 2 duplicates numbers 2 and 3. The second occurence of 3 has a smaller index than the second occurence of 2 does, so the answer is 3.
- For a = [2, 2], the output should be soultion(a) = 2.
- For a = [2, 4, 3, 5, 1], the output should be solution(a) = -1

## Input

> execution time: 3 seconds (java)

> memory limit: 1GB

> 1 <= a.length <= 10\*\*5

> 1 <= a[i] <= a.lenght
