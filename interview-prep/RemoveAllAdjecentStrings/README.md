Got it. Let's start the next interview challenge.

***

**Problem 1047:** Given a string `s`, a duplicate removal consists of choosing two adjacent and equal letters and removing them. We repeatedly make duplicate removals on `s` until we can no longer do so. Return the final string after all such duplicate removals have been made.

**Example:**
* `s = "abbaca"` should return `"ca"`.
    * First, remove "bb" from "abbaca" to get "aaca".
    * Then, remove "aa" from "aaca" to get "ca".
* `s = "azxxzy"` should return `"ay"`.
    * First, remove "xx" from "azxxzy" to get "azzy".
    * Then, remove "zz" from "azzy" to get "ay".

What's your initial approach to solving this problem?

# Summary
I think it is necessary the use two stacks to store the current traversing of the string with a two-pass approach where first approach fills first stack and in the other pass we will fill the final stack, in this loop, we will compare top element of both stacks if the popped elements are different we will store the popped element in the first stack, in other case, we ignore the popped elements. Finally, in order to return the second stack to string
--- interviewer
That's a very good initial thought. Using stacks to handle adjacent elements is a common and correct pattern. Your idea of comparing the top elements is a key part of the solution.

However, your approach of using **two stacks and two passes** is a bit more complex than necessary. This problem can be solved more efficiently with just a **single stack** and a **single pass** through the string.

Let's think about the process with one stack:

1.  You would iterate through the input string, character by character.
2.  For each character, you would look at the top of your stack.
3.  If the stack is not empty and the top element is the same as your current character, what would you do?
4.  If the top element is different, or the stack is empty, what would you do with your current character?

How would you adjust your logic to use this single-stack, single-pass approach?
-- io
# APPROACH
Oh, that's right I didn't notice it. Okay, once you have already shared with me this. I think it's correct to create an stack for elements -> when iterating the string, we add the elements in case the stack is empty or the current character is different than the peek of the stack, in case both elements are equal we use pop() operation to remove both adjacent characters, in this way the time complexity would be O(n) where n is the length of the string and the space complexity would be O(n) where n is the number of elements in the stack, worst case the same length of the string
# VARIABLES
- Stack: Storing the elements that doesn't have any adjacent duplicates

# CORE LOGIC
- Create an empty stack
- Iterate the string char by char
- Check if stack is empty -> push current char
- In case stack is not empty, check if the peek element in the stack is the same as the current char
- Both elements are equal, we use pop operation to remove adjacent duplicate character
- Both elements are different, we use push operation to keep the string

# RETURN 
- Return the content in the stack with the toString function

```java
public String removeAdjacentDuplicates (String word) {
        Stack<Character> result = new Stack<>();
        for (char current : word.toCharArray()) {
            if (result.isEmpty()) {
                result.push(current);
            } else {
                if (result.peek() != current) {
                    result.push(current);
                } else {
                    result.pop();
                }
            }
        }
        return result.toString();
    }
```