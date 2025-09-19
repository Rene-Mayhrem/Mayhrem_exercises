Hello! Thank you for joining me. I'm ready to begin the interview.

I'll be your interviewer today. The interview will last about 45 minutes, and we'll focus on your problem-solving skills, not just the final answer. Please feel free to think out loud, ask questions, and discuss your approach at every step.

Let's start with our first question.

***

### **Question 1: Valid Parentheses**

You are given a string `s` containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
1.  Open brackets must be closed by the same type of brackets.
2.  Open brackets must be closed in the correct order.
3.  Every close bracket has a corresponding open bracket of the same type.

Note that an empty string is also considered valid.

**Example 1:**
* Input: `s = "()"`
* Output: `true`

**Example 2:**
* Input: `s = "()[]{}"`
* Output: `true`

**Example 3:**
* Input: `s = "(]"`
* Output: `false`

What are your initial thoughts on how to approach this problem?

# INITIAL APPROACH
Since it doesn't seems to be any issue related to the paramater. I'll proceed with the initial solution. I am thinking first for readability and also for time performance to create a HashMap of parentheses, where we determine the relation between an open bracket and its valid closing bracket. This approach seems to be fully iterated so traversing the string `s` is necessary in order to analyze each character. Creating an stack is also important, in this way we will track what was the last opening used bracket. In every iteration, we'll need to check wheter the current char is an opening bracket, in case of being an opening bracket we'll add it to the stack, in case of being a closing bracket, we pop out last stack element and compare if it's valid. After iterating a valid string represents that our stack has been completly emptied and all the string has been iterated. Another edge case we need to consider is that the length of the string need to be pair, in other case, we can assume is not a valid string.

# TIME AND SPACE COMPLEXITY
- Time complexity: O(n) since we are iterating the string
- Space complexity: O(n) in the worst case the stack can be the same lenght of n

# VARIABLES
- Map - Created for quickly check for corresponding pairs -> "{":"}"
- Stack - Used to store only opening brackets 

# CORE LOGIC
- Check if string is odd, return false
- Create a Map with the opening and closing brackets
- Create an empty stack
- Iterate the string
- Check if the current char is opening. If its opening bracket add it to the stack
- It's a closing bracket. We pop the the element from our stack, we need to compare value char with current char
- In case there are different characters, return false, otherwise, keep iterating

# RETURN
If the stack is empty at the end of the iteration, it represents it's a valid parentheses with matching opening and closing brackets

```java
    public Boolean isValidParentheses (String word) {
        if (word.length() % 2 != 0) return false; 
        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put('{', '}');
        parentheses.put('(', ')');
        parentheses.put('[', ']');
        Stack<Character> openingBrackets = new Stack<>();
        for (Character current : word.toCharArray()) {
            if (parentheses.containsKey(current)) {
                openingBrackets.add(current);
            } else if (!openingBrackets.isEmpty()) {
                char element = openingBrackets.pop();
                if (parentheses.get(element) != current) return false;
            } else return false;
        } 
        return openingBrackets.isEmpty();
    }
```