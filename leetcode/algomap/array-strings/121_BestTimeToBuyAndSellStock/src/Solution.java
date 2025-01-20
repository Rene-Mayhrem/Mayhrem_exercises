public class Solution {
  //? INPUT -> an array of integers -> only positive values or zero
  // ? OUTPUT -> zero if there is no other profit, else return a positive value
  // * 1. Create a minPrice (day to buy stock) -> set as the Integer with the maxValue
  // * 2. Create a maxProfit = 0, in case we do not have a max profit, we return 0 as not possible
  // * 3. Iterate the prices array by index
  // * 3.1 Reassign minPrice as the min of prices[i] and minPrice itself
  // * 3.2 Reassign maxProfit as the max of the substraction of (prices[i] - minPrice) and maxProfit itself
  // 4. Return the value of maxProfit
  public int maxProfit (int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      minPrice = Math.min(minPrice, prices[i]);
      maxProfit = Math.max(maxProfit, (prices[i] - minPrice));
    }
    return maxProfit;
  }
}
