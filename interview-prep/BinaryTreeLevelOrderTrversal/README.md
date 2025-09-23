Alright, let's proceed.

-----

### **Question 7: Binary Tree Level Order Traversal**

Given the `root` of a binary tree, return the **level order traversal** of its nodes' values. (i.e., from left to right, level by level).

You can assume the following `TreeNode` class is provided:

```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
```

**Example 1:**

  * **Input:** `root = [3, 9, 20, null, null, 15, 7]`
  * **Output:** `[[3], [9, 20], [15, 7]]`

**Example 2:**

  * **Input:** `root = [1]`
  * **Output:** `[[1]]`

**Example 3:**

  * **Input:** `root = []`
  * **Output:** `[]`

What are your initial thoughts on how to approach this problem?

# APROACH
It is needed to traverse the tree using BFS, so implementing BFS using a queue to process level by level. Before any traversal, we need to create an empty List and a Queue, we add the root element in the queue and traverse the TreeNode while the queue is not empty. in every iteration we need to get the current size of the queue (based on the nodes per level) and we need to create an empty list. Then we poll the number of nodes of the queue, add the values to the created list and add its children; after polling all those nodes, we simply add the list to the main list  