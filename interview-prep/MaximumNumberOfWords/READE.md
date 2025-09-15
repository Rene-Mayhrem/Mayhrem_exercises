Got it. Let's start the next interview challenge.

Problem 1935: Given a string text and a string brokenLetters, return the number of words in text that can be typed.

A word can be typed if none of the characters in brokenLetters appear in that word.

Example:

    text = "hello world", brokenLetters = "ad"

        The words are "hello" and "world".

        'a' is in brokenLetters, so "hello" cannot be typed.

        'a' and 'd' are not in "world", so "world" can be typed.

        The answer is 1.

    text = "leet code", brokenLetters = "e"

        The words are "leet" and "code".

        'e' is a broken letter, so neither word can be typed.

        The answer is 0.

What's your initial approach to solving this problem?

# QUESTIONS

- About my parameters, is it a constraint about the case-sensitive in my words, do I need to cast them into lower case or I can assume all strings are lowercase?
- As far as I understand, the text variable can hold multiple words, spaces. Can it contains other characters such as english letter?

# SUMMARY
My approach will be two pass algorithm using a Set for my brokenLetters this will allow to me to check if the text contains any of my broken letter in an O(1) operation. The in my second interation I'll split my text by spaces and analyze each string character by character checking its existece in the previous created set, for every complete iteration I'll create an auxiliar variable to keep count of the number of words that can be used

Another option to use, it's still a two pass approach, instead of using a set, we will use a 26-fixed array boolean and we will set true all the values inside the broken letters, similar approach, we will iterate the text words character by character and if we get a true value, it means that word is not longer usable. This operation is also O(n) but the retrieve is O(1).
It can be a better option than the set, since the set can be o(k) depending the broken letters

trade-off: space complexity. 26-fixed array is better than Set and the hashing processs.

# VARIABLES
- Creating a 26-fixed size array of booleans intialized with false
- Create a wordsCounter = 0 -> represents the valid words that doesn't contains the broken letters

# CORE LOGIC
- Create the 26-foxe array with boolean -> false
- Create the counter for the useful words -> 0s
- First-pass -> Fill the 26-fixed array with the letters on brokenLetters string by the operation of current - 'a' -> represents the index -> true
- Second-pass -> Split the words in the text by spaces, in this iteration traverse each word and check if the value in the 26-fixed array is not true, if we get a true we skip that word and continue to the next, in other case, we increase the value of wordCounter

# RETURN
- Return the value of wordCounter

Hello [Person's Name],

My name is [Your Name], I'm a DevOps Engineer in Mexico. I'm genuinely fascinated by Japanese culture and professional environments, and I'd be great to connect and perhaps gain some insights.

Cheers,
[Your Name]"

Option 3: Very Concise & Open


Hi  Aahan Rawat,

René Cruz here, a DevOps Engineer from Mexico. I have a huge interest in Japan – its culture and industry – and would love to expand my network with people working there.

Hope to connect!
René c: