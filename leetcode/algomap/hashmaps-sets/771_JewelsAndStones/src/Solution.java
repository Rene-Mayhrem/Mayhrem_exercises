import java.util.HashSet;
import java.util.Set;

public class Solution {
  // ? INPUT
  // * Two strings -> jewels and stones
  // * Jewels has unique values 
  // * Letters are case sensitive
  // ? OUTPUT
  // * Number of jewels in stones (input)
  // ? SOLUTION
  // * Create a hashSet of jewels (due has unique values)
  // * Create int for counter -> currentJewels
  // * Iterate element by element in stones 
  // * Check if the current element in stones exists in the set, currentJewels will be incremented
  // * Return the value of currentJewels
  public int numJewelsInStones (String jewels, String stones) {
    Set<Character> jewelSet = new HashSet<>();
    // ! Fill the set with the values of jewels
    for (Character jewel : jewels.toCharArray()) jewelSet.add(jewel);
    // ! Create auxiliar variable to count current jewels in stones
    int currentJewels = 0;
    for (int i = 0; i < stones.length(); i++) {
      // ! Check if the element in the stones exists in the jewels set
      if (jewelSet.contains(stones.charAt(i))) currentJewels++;
    }
    return currentJewels;
  }
}
