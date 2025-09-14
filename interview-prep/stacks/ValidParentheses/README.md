Sure. Let's do some exercises to practice working with stacks.

Exercise 1: Valid Parentheses

This is a classic problem. You're given a string that contains just the characters (, ), {, }, [, and ]. Your task is to determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.

    Open brackets must be closed in the correct order.

    Every close bracket has a corresponding open bracket of the same type.

Let's try an example:

    Input: ()

    Output: True

    Input: ()[]{}

    Output: True

    Input: (]

    Output: False

How would you use a stack to solve this problem? What's the general strategy?

# Approach

INITIALIZTATION:
- Map: to store bracket pairs
- Stack: to store opening brackets -> empty
TRAVERSAL
- Iterate through each characters of the string -> one pointer
CORE LOGIC
- (Current character is opening bracket) 
    - Push the char into the stack
- (Current character is closing bracket)
    - First, check if the container is empty. If it is, the string is invalid
    - If it is not, pope the element from the stack. If the popped element in the stack is different than the current character -> invalid string
RETURN -> empty stack
- If the stack is not empty that means the string is invalid, otherwise is valid
