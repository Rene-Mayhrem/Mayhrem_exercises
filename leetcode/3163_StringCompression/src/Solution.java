public class Solution {
  // * input -> string with characters
  // * output -> compressed string 
  //? if word is empty return empty
  //? create an array of characters from word
  //? create aux var for same characters -> counter
  //? iterate this array starting from 1 to the last element
    //? create prev and current char
    //? if prev == current
      //? if aux == 9
        //? Append to the string builder aux and current, set aux equal to 1
      //? else -> increment aux
    //? else -> append aux and prev to string builder

  // public String compressedString (String word) {
  //   if (word.isEmpty()) return "";
  //   StringBuilder result = new StringBuilder();
  //   int aux = 1;
  //   for (int i = 1; i < word.length(); i++) {
  //     char prev = word.charAt(i - 1);
  //     char current = word.charAt(i);
  //     System.out.println("prev -> "+prev);
  //     System.out.println("curr -> "+current);
  //     if (prev == current) {
  //       if (aux == 9) {
  //         result.append(aux);
  //         result.append(current);
  //         aux = 1;
  //       } else {
  //         aux++;
  //         if (i == word.length() - 1) {
  //           result.append(aux);
  //           result.append(current);
  //         }
  //       }
  //     } else {
  //       result.append(aux);
  //       result.append(prev);
  //       aux = 1;
  //     }
  //   }
  //   return result.toString();
  // }

  //! First appraoch does work but has there are some issues in the solution
  //? Create a variable to iterate through the word (pointer)
  //? Create a frequency variable -> 0
  //? Create current -> word.charAt(pointer)
    //? while pointer less than word length and frequency < 9 and current equal than word characater at pointer
      //? increment pos and frequency
    //? append frequency and current
  public String compressedString (String word) {
    StringBuilder result = new StringBuilder();
    int pointer = 0;
    while (pointer < word.length()) {
      int frequency = 0;
      char current = word.charAt(pointer);
      while (
        frequency < 9 &&
        pointer < word.length() &&
        current == word.charAt(pointer)
      ) {
        pointer++;
        frequency++;
      }
      result.append(frequency).append(current);
    }
    return result.toString();
  }
}
