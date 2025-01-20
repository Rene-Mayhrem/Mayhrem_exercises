public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

    // Test case 1: General case
    int[] prices1 = {7, 1, 5, 3, 6, 4};
    System.out.println("Test case 1: " + (solution.maxProfit(prices1) == 5));

    // Test case 2: No profit possible
    int[] prices2 = {7, 6, 4, 3, 1};
    System.out.println("Test case 2: " + (solution.maxProfit(prices2) == 0));

    // Test case 3: Single day prices
    int[] prices3 = {5};
    System.out.println("Test case 3: " + (solution.maxProfit(prices3) == 0));

    // Test case 4: Two days prices with profit
    int[] prices4 = {1, 5};
    System.out.println("Test case 4: " + (solution.maxProfit(prices4) == 4));

    // Test case 5: Two days prices with no profit
    int[] prices5 = {5, 1};
    System.out.println("Test case 5: " + (solution.maxProfit(prices5) == 0));

    // Test case 6: Prices with all same values
    int[] prices6 = {3, 3, 3, 3, 3};
    System.out.println("Test case 6: " + (solution.maxProfit(prices6) == 0));
    }
}
