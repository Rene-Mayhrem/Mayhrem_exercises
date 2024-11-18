import java.util.Arrays;

public class CoinChange {
  public static void main(String[] args) {
    Solution2 sol = new Solution2();
    int[] coins = { 1, 2, 5, 8, 10 };
    sol.coinChange(coins, 10);

  }
}

class Solution2 {
  public int coinChange(int[] coins, int amount) {
    // ? We create a array of the value of the amount + 1;
    int[] amt = new int[amount + 1];
    Arrays.fill(amt, amount + 1);
    amt[0] = 0;

    for (int i = 1; i <= amount; i++) {
      for (int j = 0; j < coins.length; j++) {
        if (i >= coins[j]) {
          amt[i] = Math.min(amt[i], 1 + amt[i - j]);
        }
      }
    }

    if (amt[amount] < amount + 1) {
      return amt[amount];
    }
    return -1;
    // for (int number : amt) {
    // System.out.println(number);
    // }

    // return 0;
  }
}