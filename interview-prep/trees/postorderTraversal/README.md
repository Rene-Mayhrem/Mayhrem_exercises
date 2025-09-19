Let's do it! This is the last of the three main tree traversals, and it builds on everything we've talked about.

***

### **Problem 145: Binary Tree Postorder Traversal**

Given the `root` of a binary tree, return the **postorder** traversal of its nodes' values.

**Postorder Traversal:** The process of visiting nodes in the order of **Left -> Right -> Root**.

**Example 1:**
* **Input:** `root = [1, null, 2, 3]`
* **Tree:**
  
* **Output:** `[3, 2, 1]`

**Example 2:**
* **Input:** `root = []`
* **Output:** `[]`

What are your initial thoughts on how to solve this problem? Consider how your approach might be similar to, or different from, the inorder and preorder traversals we've already done.

# Approach

Creating an empty list and a stack are necessary for postorder traversal. After the initialization of this elements, is necessary to iterate the tree while the stack is not empty by adding the root as the first element, since this element is the one that comes to the last. Then, we need to move to the left as far as possible and add the elements to the list and then move to the right. Since postorder traversal is: left -> right -> root