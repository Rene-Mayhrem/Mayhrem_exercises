You got it. Let's move on to the next one. This is another classic string problem.

Problem: Write a function that takes a string and determines if it is a palindrome. A palindrome is a word, phrase, or sequence that reads the same backward as forward.

For this problem, assume that we only care about alphanumeric characters and we should ignore case.

Example:

    "A man, a plan, a canal: Panama" should return true.

    "race a car" should return false.

How would you approach this problem? What's your initial thought process?

# Approach
1. As far as I can see in the example, I need to process the string first by removing Upper case characters and also non-alphanumerical character such as commas, dots and spaces
2. The best way to resolve this exercise is by using two pointers -> end and left. MOve both pointer until they reach each other and they are the same character, in case they are different, we return false
