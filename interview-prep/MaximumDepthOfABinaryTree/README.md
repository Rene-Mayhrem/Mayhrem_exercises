### **Question: Maximum Depth of a Binary Tree**

Given the `root` of a binary tree, return its **maximum depth**.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

You can assume the same `TreeNode` class from the previous problem.

**Example 1:**
* **Input:** `root = [3,9,20,null,null,15,7]`
* **Output:** `3`

**Example 2:**
* **Input:** `root = [1,null,2]`
* **Output:** `2`

What are your initial thoughts on how to approach this problem?

# APPROACH
Using BFS for this case seems to be the best way to solve this problem. I'll be creating a variable called levels, and after every level reach, this variable will increase, we return the final value of this level variable since its the maximu depth

# VARIABLES
- Queue -> to traverse a tree with BFS it's needed to have a Queue
- levels -> to keep track of the levels in the tree

# CORE LOGIC
- Check if root is not null, then just return 0
- Initialize levels with 0 and the queue with the root element
- Traverse the tree while the queue is not empty
- Increase levels variable since we are going to another level
- Get the current size of the queue, in order to just poll all the related nodes to that level
- Poll the elements from the queue and add it's children
- Return the value of levels in the end