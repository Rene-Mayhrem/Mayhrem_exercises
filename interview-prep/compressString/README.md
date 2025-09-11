Great, let's move on. We'll do a different kind of string problem, but one that's also very common in interviews.

Problem: We have a string, and we need to compress it by replacing consecutive repeating characters with the character followed by the number of its repetitions. If the compressed string is not smaller than the original string, we should return the original string.

For example:

    aabcccccaaa would become a2b1c5a3

    abcde would remain abcde because the compressed version a1b1c1d1e1 is longer.

How would you start to approach this problem? What's your initial thought process?

# Initial thoughts 
1. I am thinking about using sliding window to determine the length of the consecutive characters with a counter to modify it
2. Using a StringBuilder object is more effective than using a regular string to create the last string
3. Having this analysis I think we might need a ternary operation in the return statement in order to send the smaller string
4. Time complexity O(n) since we are iterating the string
5. Space complexity O(1) since we are not using another DSA or modifying the string directly