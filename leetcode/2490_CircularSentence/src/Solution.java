public class Solution {
  public boolean isCircularSentence (String sentence) {
    //? Input -> sentence (can be words separated by spaces)
    //? output -> boolean if sentence is circular
    /*
     * Circular sentence if:
     * The last character of a word is the same character that the next word first character
     * The last word character is the same that the first character of the first word
     */

     //? Create an array from the sentence string parameter -> by space
     //? Check if sentence array length is 1
      //? return first character equal than last character of the only word
     //? Compare first character of first word equal to last character of last word
      //? Iterate my array starting by index 1 to my last word (i = 1 : i < sentenceArray.length)
        //? Create two aux var for current and previous (words)
        //? Compare if prev last character is different than current first character
          //? return false (because it doesn't follow the rules)

      String[] words = sentence.split(" ");
      if (words.length == 1) {
        return (sentence.charAt(0) == sentence.charAt(sentence.length() - 1));
      }
      String firstWord = words[0];
      String lastWord = words[words.length - 1];
      if (firstWord.charAt(0) == lastWord.charAt(lastWord.length() - 1)) {
        for (int i = 1; i < words.length; i++) {
          String current = words[i];
          String prev = words[i - 1];
          if (prev.charAt(prev.length() - 1) != current.charAt(0)) {
            return false;
          }
        }
        return true;
      }
    return false;
  }
}
