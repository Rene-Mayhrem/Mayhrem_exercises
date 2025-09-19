No problem at all. LeetCode problem #94 is an excellent way to practice in-order traversal. It's a fundamental problem that really tests your understanding of the **Left, Root, Right** rule.

### LeetCode Problem #94: Binary Tree Inorder Traversal

The problem asks you to perform an in-order traversal of a binary tree and return a list of its node values.

**Problem Statement:**

Given the `root` of a binary tree, return the **in-order** traversal of its nodes' values.

**Example 1:**
* Tree: `root = [1, null, 2, 3]`
* **Output:** `[1, 3, 2]`
* **Explanation:**
    * Start at the root, 1. Go to its left side (null).
    * Visit the root, 1.
    * Go to its right side, 2.
    * At node 2, go to its left side, 3.
    * Visit 3.
    * Go to 2's right side (null).
    * Visit 2.

**Your Task:**

Think about the concepts we've covered and how you would implement a solution. You can use either a **recursive** or an **iterative** approach.

* **Recursive Approach:** This is often the most intuitive. How would you define a helper function that takes a node and a list, and then calls itself on the left and right children?
* **Iterative Approach:** This requires a bit more thought and a stack. How would you use a stack to keep track of the nodes you still need to visit? How do you ensure you always visit the left-most node first?

Take a moment to formulate a plan for either approach. Once you're ready, share your ideas, and we can look at the code. Good luck!

# APPROACH

- Create an stack -> needed for the traversal
- Create a list -> return type needed
- Create a node current => root -> in order to move the traversal
- Iterate while the stack is not empty or the current node is not null
- We keep pushing elements while the current node is not null and we keep moving the node to the left.
- After current is null, we add the popped elements and we move to the right
