public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Solution {
    public int numberOfCuts (int n) {
        // ? not cutting
        if (n == 1) return 0;
        return (n % 2 == 0) ? n / 2 : n;
    }
}
