Excellent. Let's move on to the next question.

***

### **Question 3: Merge Two Sorted Lists**

You are given the heads of two sorted linked lists, `list1` and `list2`.

Merge the two lists in a single **sorted** list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

**Example 1:**
* **Input:** `list1 = [1, 2, 4]`, `list2 = [1, 3, 4]`
* **Output:** `[1, 1, 2, 3, 4, 4]`


**Example 2:**
* **Input:** `list1 = []`, `list2 = []`
* **Output:** `[]`

**Example 3:**
* **Input:** `list1 = []`, `list2 = [0]`
* **Output:** `[0]`

What are your initial thoughts on how to approach this problem?

# Approach

Create a new dummy node, which is out return linkedList node. We will iterate through the list by the following condition; list1 != null & list2 != null, in this case, while both list have value we will keep add them those until we reach the end. In case one of the list is empty and the other one is not, we need to create a condition to add all the remaining nodes of the list with remaining nodes. Inside the iteration, we need to create condition while the list still has elements, we keep adding creating a node to then compare which value needs to be added.

# VARIABLES
- ListNode dummy => merge of both linked lists

# CORE LOGIC
- Create dummy ListNode -> empty
- Iterate while list1 or list are not null
    - Create two list nodes to hold current data from lists
    - Check if list1 is not null, then initialize the node and move the head pointer -> traverse the list
    - Check if list1 is not null, then initialize the node and move the head pointer -> traverse the list
    - In case both nodes, add the greater value, if any of the values is null, just ignore
- Return dummy node