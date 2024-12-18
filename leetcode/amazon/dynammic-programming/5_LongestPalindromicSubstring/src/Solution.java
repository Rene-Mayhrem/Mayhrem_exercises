public class Solution {
  // A phrase is a palindrome if, after converting all uppercase letters into
  // lowercase letters and removing all non-alphanumeric characters, it reads the
  // same forward and backward. Alphanumeric characters include letters and
  // numbers.

  // Given a string s, return true if it is a palindrome, or false otherwise.

  // Example 1:

  // Input: s = "A man, a plan, a canal: Panama"
  // Output: true
  // Explanation: "amanaplanacanalpanama" is a palindrome.
  // Example 2:

  // Input: s = "race a car"
  // Output: false
  // Explanation: "raceacar" is not a palindrome.
  // Example 3:

  // Input: s = " "
  // Output: true
  // Explanation: s is an empty string "" after removing non-alphanumeric
  // characters.
  // Since an empty string reads the same forward and backward, it is a
  // palindrome.

  //? INPUT -> contains any characters -> convert it to lower case and remove all non-numerical characters
  //? OUTPUT -> boolean -> true is palidrome where a palindrome it is read it from start to end and from end to start the same way
  //? SOLUTION 
  //? Remove all non-alphanumerical characters and convert to lower case
  //? Check palindrome with two pointers -> start = 0, end = s.length() - 1
  //? return true if characters -> start and end are not different in every iteration
  public boolean isPalindrome (String s) {
    s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    int start = 0;
    int end = s.length() - 1;
    while (start < end) {
      if (s.charAt(start) != s.charAt(end)) return false;
      start++;
      end--;
    }
    return true;
  }

  //? INPUT 
  //? OUTPUT 
  //? SOLUTION
  //? Create stringBuilder longestPalindrome = ""
  //? Iterate through all my string characters -> i = 0
    //? Create an aux var to create substring -> aux = i
    //? While the function !isPalindrome() && aux < s.length()
      //? Increment aux
      //? Appending new element to the string
    //? Check length of current lones



  public String longestPalindrome (String s) {

  }

}
