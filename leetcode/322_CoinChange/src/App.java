import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] coins = {6, 1, 2, 5};
        
        System.out.println(solution.coinChange(coins, 11));
    }
}

class Solution {
    public int coinChange (int[] coins, int amount) {
        

        int ans = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (coins[i] <= amount) {
                ans++;
                amount = amount - coins[i];
            }
        }

        return ans >= 0 && amount == 0 ? ans : -1;
    }

    private void quicksort (int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);


        }
    }

    private int partition (int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

