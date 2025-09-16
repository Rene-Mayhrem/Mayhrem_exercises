Got it. Let's start the next interview challenge.

***

**Problem 929:** Every valid email consists of a local name and a domain name, separated by the `'@'` sign.

* Periods `.` in the **local name** are ignored.
* Characters after a plus `+` in the **local name** are ignored.
* Domain names are not affected by these rules.

Given an array of strings `emails`, return the number of unique email addresses.

**Example:**
* `emails = ["test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"]`
* The unique emails are `testemail@leetcode.com` and `testemail@lee.tcode.com`.
* The answer is **2**.

What's your initial approach to solving this problem?

# Initial approach
First-pass iterate the array of emails and in every iteration perform the following task. Separate the current string by '@' character; the whole function process works around the local name, we need to replace all '.' symbols with empty, split the local name with the "+" symbol and just keep the first element in the array. Store the normalized email in a Set to avoid duplicates, returnt the size of the selected set. Withtin this solution the time complexity is O(n) where n is the lenght of the array and the space complexity is O(n) where in the worst case there's no duplicate emails and the set is the same length than the array.

# VARIABLES
Set: Store valid emails after normalized 

# CORE LOGIC
1. Create empty stack -> emailsSet
2. Traverse the array of strings
3. Split the email by '@' symbol 
4. Create function normalizeLocalEmail -> Split the string by '+' and replace all '.'
5. Add normalized email to the stack appending '@' and global 

# RETURN
Return the size of the set