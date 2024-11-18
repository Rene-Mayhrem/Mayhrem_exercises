public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] prices = {7, 1, 5, 3, 4, 6};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }
}

class Solution {
    public int maxProfit (int[] prices) {
        int min = prices[0], profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if ((min - prices[i]) < profit) {
                profit = min - prices[i];
            }
            if (prices[i] < min) {
                min = prices[i];
            }
        } 
        return profit < 0 ? Math.abs(profit) : 0;
    }
}