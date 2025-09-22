### **Question 6: Diameter of Binary Tree**

Given the `root` of a binary tree, return the **length of the diameter** of the tree.

The **diameter** of a binary tree is the length of the longest path between any two nodes in the tree. This path may or may not pass through the `root`.

The length of a path between two nodes is represented by the number of edges between them.

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

  * **Input:** `root = [1, 2, 3, 4, 5]`
  * **Output:** `3`
  * **Explanation:** The longest path is `4-2-1-3` or `5-2-1-3`. The length is 3.

**Example 2:**

  * **Input:** `root = [1, 2]`
  * **Output:** `1`

What are your initial thoughts on how to approach this problem?

# Approach
I might need to create a DFS iteration with a maxDiameter as variable to get the the longest path
