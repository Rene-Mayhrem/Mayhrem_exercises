Problem: Write an algorithm to reverse a C-style string.

What do you think of when you hear "C-style string"? What does that mean for how we handle the string?

Ah, that's a key part of this problem. When we talk about a "C-style string" 📜, we're referring to a sequence of characters that is terminated by a special null character (\0). This is different from a modern String object in Java or Python, which knows its own length. The \0 is essentially a stop sign for any function that's processing the string.

To reverse a C-style string, you have to find that \0 first to know where the string ends.

Let's look at some test cases to get a better feel for it.

Test Cases

Input: a character array or a string that we'll treat as a C-style string.
Output: The reversed string.

    char[] input1 = {'a', 'b', 'c', '\0'};

        Expected Output: {'c', 'b', 'a', '\0'}

    char[] input2 = {'h', 'e', 'l', 'l', 'o', '\0'};

        Expected Output: {'o', 'l', 'l', 'e', 'h', '\0'}

    char[] input3 = {'a', '\0'};

        Expected Output: {'a', '\0'}

    char[] input4 = {'\0'};

        Expected Output: {' \0'}

Now that we have a better idea of what a C-style string is, how would you approach reversing it? What's the first thing we'd need to do to solve this problem?