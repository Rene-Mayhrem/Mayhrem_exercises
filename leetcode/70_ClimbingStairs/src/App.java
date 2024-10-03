public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Solution {
    public int climbingStairs (int n) {
        if (n == 1) {
            return 1;
         }

         int one = 1;
         int two = 2;

         for (int i = 3; i <= n; i++) {
            int total = one + two;
            one = two;
            two = total;
         }
         return two;
    }
} 