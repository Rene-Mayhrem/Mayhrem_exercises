That's great! Let's solidify your interview skills with another challenging, yet common, array problem.

This next problem tests your ability to think about array traversal and boundary conditions, which is crucial for a Software Engineer role.

## New Interview Question: Container With Most Water

You are given an integer array `height` of length $n$. There are $n$ vertical lines drawn such that the two endpoints of the $i^{th}$ line are $(i, 0)$ and $(\mathbf{i}, \mathbf{height[i]})$.

Find two lines that, together with the x-axis, form a container that holds the most water. Return the maximum amount of water a container can store.

**Constraint:** You cannot slant the container.

---

### Example

| Index ($i$) | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| $\text{height}[i]$ | 1 | 8 | 6 | 2 | 5 | 4 | 8 | 3 | 7 |

If you pick the line at index 1 (height 8) and the line at index 6 (height 8):
* **Width:** $6 - 1 = 5$
* **Height:** $\min(8, 8) = 8$
* **Area:** $5 \times 8 = 40$

---

### Initial Thoughts: Brute Force

What would be the simplest, brute-force approach to solve this, and what would the time complexity be? 🧠

## INITIAL APPROACH
The brute-force in this exercise, is by using nested loops, which represent the iteration of the of all the available and possible combination of containers, except for itself, but this approach is quite time consuming O(n*n). The better approach is using two pointers left and right and move them. We need to create a variable called maxArea which will represent the value of the container that can hold the most water. Inside the loops it's important to define the height and the base of the container where base is distance between points and height is the min value between heights[left] and heights[right]