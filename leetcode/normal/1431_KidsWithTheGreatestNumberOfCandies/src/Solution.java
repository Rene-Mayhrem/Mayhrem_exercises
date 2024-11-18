import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<Boolean> kidsWithCandies (int[] candies, int extraCandies) {
    //? input -> int[] candies (number of candies per kid), quntity of candies that are going to be added
    //* output -> List<boolean> if candies[i] + extraCandies > max number of candies
    //! Create a var called maxCandies => the maximum int in the candies array = candies[i]
    //! Iterate through the candies array, starting by index 0
      //! Check if candies[i] is greater than the value of maxCandies
        //! Assign new value to maxCandies -> candies[i]
      //! Assign a new value to the current candies -> candies[i] + extraCandies
    //! Create an empty list of boolean
    //! Iterate the modified candies array, starting by index 0
      //! Check if current candv value is equal o greater than maxCandies
        //! Append a true value to the list, in other case, append false
    int maxCandies = candies[0];
    
    for (int i = 0; i < candies.length; i++) {
      if (candies[i] > maxCandies) {
        maxCandies = candies[i];
      }
      candies[i] += extraCandies;
    }
    List<Boolean> kids = new ArrayList<>();
    for (int i = 0; i < candies.length; i++) {
      if (candies[i] >= maxCandies) {
        kids.add(true);
      } else {
        kids.add(false);
      }
    }

    return kids;
  }

  public List<Boolean> kidsWithCandiesSimplified (int[] candies, int extraCandies) {
    int maxCandies = candies[0];
    for (int candy : candies) {
      maxCandies = Math.max(candy, maxCandies);
    }
    List<Boolean> result = new ArrayList<>();
    for (int candy : candies) {
      result.add((candy + extraCandies) >= maxCandies);
    }
    return result; 
  }
}
