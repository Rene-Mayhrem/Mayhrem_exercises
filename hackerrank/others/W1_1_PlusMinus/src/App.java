import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Solution sol = new Solution();
        sol.plusMinus(Arrays.asList(1, 1, 0, -1, -1));
    }
}

class Solution {
    public void plusMinus (List<Integer> arr) {
        int positive = 0, negative = 0, zeros = 0;
        double size = arr.size();
        for (Integer number : arr) {
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        
        System.out.printf("%.6f", positive/size);
        System.out.println();
        System.out.printf("%.6f", negative/size);
        System.out.println();
        System.out.printf("%.6f", zeros/size);
        System.out.println();
        
    }
}