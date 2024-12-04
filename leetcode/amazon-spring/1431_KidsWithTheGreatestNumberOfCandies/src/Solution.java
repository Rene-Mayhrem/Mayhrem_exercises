import java.util.ArrayList;
import java.util.List;

public class Solution {
  // ? // Find the maximum value
  // ? Add the extra candies to the array
  // ? Create the result array of booleans
  // ? Compare old value with new value
  public List<Boolean> KidsWithhCandies (int[] candies, int extraCandies) {
    List<Boolean> result = new ArrayList<>();
    //! Find the greatest number of candies
    int max = 0;
    for (int candy : candies) {
      if (candy > max) max = candy;
    }

    for(int candy : candies) {
      result.add((candy + extraCandies) >= max);
    }
    return result;
  } 
}
