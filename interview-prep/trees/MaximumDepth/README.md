

Let's look at **finding the maximum depth of a binary tree.** This is a great way to explore a different kind of tree traversal. The depth (or height) is the number of nodes along the longest path from the root node down to the farthest leaf node.

For example, a tree with just a root node has a depth of 1. If it has one child, the depth is 2, and so on.

How would you approach this problem?

# APPROACH
I think the best way to search by level is using BFS and add a counter fo every traverse by level.

# CORE LOGIC
- Check if root is not null -> return 0
- Create a queue `levels` to add the nodes of each level and add the root node
- Create a `maxDepth` var to count the levels = 0 (since the root is level 1)
- Traverse the tree while the stack is not empty
- Get current size of queue in order to remove all the nodes related to that level
- We increase the maxDepth since is not an empty stack
- Iterate the number of current size - in order to process the level
- In every iteration after dequeueing a node, we add its children to the queue to process those in the next iteration in case those aren't null

# RETURN 
After repeating this process level by level, we will acquire the number of levels at the end of the while and get the queue emptied. We return the number of maxDepth
