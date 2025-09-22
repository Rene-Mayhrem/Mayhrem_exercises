Excellent. Let's move on to the final question.

-----

### **Question 5: Lowest Common Ancestor of a Binary Tree**

Given a binary tree, find the **lowest common ancestor (LCA)** of two given nodes, `p` and `q`.

According to the definition of LCA on Wikipedia: "The lowest common ancestor is defined between two nodes `p` and `q` as the lowest node in `T` that has both `p` and `q` as descendants (where we allow a node to be a descendant of itself)."

You will be given the root of the tree, and the two nodes `p` and `q`. You can assume that both `p` and `q` will exist in the tree.

You can assume the following `TreeNode` class is provided:

```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
```

**Example 1:**

  * **Input:** `root = [3,5,1,6,2,0,8,null,null,7,4]`, `p = 5`, `q = 1`
  * **Output:** `3`
  * **Explanation:** The LCA of nodes 5 and 1 is 3.

**Example 2:**

  * **Input:** `root = [3,5,1,6,2,0,8,null,null,7,4]`, `p = 5`, `q = 4`
  * **Output:** `5`
  * **Explanation:** The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself.

What are your initial thoughts on how you would approach this problem?

