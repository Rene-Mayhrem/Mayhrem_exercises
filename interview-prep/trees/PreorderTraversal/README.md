Got it. Let's start the next interview challenge.

-----

### **Problem 144: Binary Tree Preorder Traversal**

Given the `root` of a binary tree, return the **preorder** traversal of its nodes' values.

**Preorder Traversal:** The process of visiting nodes in the order of **Root -\> Left -\> Right**.

**Example 1:**

  * **Input:** `root = [1, null, 2, 3]`
  * **Tree:**
    ```
      1
       \
        2
       /
      3
    ```
  * **Output:** `[1, 2, 3]`

**Example 2:**

  * **Input:** `root = []`
  * **Output:** `[]`

What's your initial approach to solving this problem? Consider both a **recursive** and an **iterative** approach, as both are common ways to solve this.

# APPROACH
Before any iteration it's needed to create an stack to move the elements, create a node to be updated and a list as their returnal type. THen we need to iterate all the element considering the two following conditions current != null or stack is not empty. After traversal we need to add elements root, left and right, and then move the pointer

