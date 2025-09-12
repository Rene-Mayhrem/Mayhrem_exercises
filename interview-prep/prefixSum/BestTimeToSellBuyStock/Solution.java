package prefixSum.BestTimeToSellBuyStock;

public class Solution {
    public int getMaxProfit (int[] prices) {
        int minPrice = 0;
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            int currentProfit = price - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
    }
}
