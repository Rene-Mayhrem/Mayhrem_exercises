Got it. Let's start the next interview challenge.

***

### **Problem 482: License Key Formatting**

You are given a string `s` which is a license key containing letters, digits, and dashes. You are also given an integer `k`.

The goal is to reformat the string `s` such that:
1.  All dashes are removed.
2.  All lowercase letters are converted to uppercase.
3.  The string is then broken into groups of `k` characters, with a dash separating each group.
4.  The very first group may be shorter than `k`, but all other groups must have exactly `k` characters.

**Example:**
* `s = "5F3Z-2e-9-w"`, `k = 4` should return `"5F3Z-2E9W"`.
* `s = "2-5g-3-J"`, `k = 2` should return `"2-5G-3J"`.
* `s = "2-", k = 2` should return `"2"`.

What's your initial approach to solving this problem?

# APPROACH

It might be good to first replace the '-' characters with empty spaces and cast the word to upper case. THen, in order to calculate the order of groups, it might be good to take the lenght of the string after normliazing the word by use the operation n % k == 0, it means the the string can be divided in groups with the exactly no. of characters without need of having a shorter group than the others by joining the string with '-' in every iteration of groups, in other case, we use the same loop, but the first element of the group need to be k - 1, and then just add the other groups normally.

# VARIABLE
- StringBuilder licensedKey -> better for performance since modifying an string it takes O(n) time and space 

# CORE LOGIC
- Normalize the string 's' in order to remove the "-" characters and to convert to upper case
- Start building the string moving from the end of the string to the beggining moving k elements and setting up a '-' character on it
- As we iterate, the first group will simply be whatever is left when you reach the beggingin of the string

# COMPLEXITY
- Time complexity: O(n) since we iterate the string
- Space complexity: O(1) since we use a string builder for performance