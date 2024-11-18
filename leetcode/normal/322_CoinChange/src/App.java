import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Solution2 solution = new Solution2();
        int[] coins = {186, 419, 83, 408};
        
        System.out.println(solution.coinChange(coins, 10));
    }
}

class Solution {
    public int coinChange (int[] coins, int amount) {
        
        bubbleSort(coins);

        for (int coin : coins) {
            System.out.println(coin);
        }

        int ans = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            System.out.println(coins[i]+" VS "+amount);
            while (coins[i] <= amount) {
                System.out.println("Heey");
                ans++;
                amount = amount - coins[i];
            }
        }

        return ans >= 0 && amount == 0 ? ans : -1;
    }

    private static void bubbleSort (int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}

