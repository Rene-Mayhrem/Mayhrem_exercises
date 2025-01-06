import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<Boolean> kidsWithCandies (int[] candies, int extraCandies) {
    //? Initialize maxCandies to keep track of the highest number of candies any kid currently has
    int maxCandies = 0;
    List<Boolean> result = new ArrayList<>();
    //? Find the maximum number of candies any kid has in the array of candies
    for (int candy : candies) maxCandies = Math.max(maxCandies, candy);
    //? Determine if each kid can have the greatest number of candies after receiving extra candies
    for (int candy : candies) result.add((extraCandies + candy) >= maxCandies);
    return result;
  }
}
