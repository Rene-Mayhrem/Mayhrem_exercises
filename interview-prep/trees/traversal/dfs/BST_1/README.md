Yes, let's dive deeper into trees! A great way to really understand a data structure is to see how it works in practice.

Let's start with a problem that involves a **Binary Search Tree (BST)**. This is a very common type of tree where every node has a specific order:
* The value of a node is greater than all the values in its left subtree.
* The value of a node is less than all the values in its right subtree.

Here's the problem: **Given the root of a Binary Search Tree and a value `k`, find the node in the BST that has the value `k`**.

How would you use the properties of a BST to efficiently find the node with value `k`? What would be your first step?

# Summary
Based in the properties of the BST left > root > right. We can traverse by selecting specific nodes in order to avoid unnecessary iteration by going to the left or going to the right depending the value of current node. However, there are some special casses we need to take under consideration:
- Node is null -> reach the end of the tree -> not found
- Node value is equal to k value -> return node
- Node value is less than k value -> move to the left
- Node value is grather than k value -> move to the right

# CORE LOGIC
- Traverse the tree while true -> infinite condition, the reason of our 4 cases
- Check if the current value of node == null -> return -1 (not found)
- Check if the current value of node == k -> return node (founded)
- Check if the current value of node < k -> move current to current.left
- Check if the current value of node > k -> mode current to current.right

# QUESTIONS RETURN
What is the return type? In case I found the node I return the same node or boolean? In case of not found, is it okay to return null?