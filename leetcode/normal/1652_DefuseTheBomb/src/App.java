import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int[] arr = {2, 4, 9, 3};
        // System.out.println(new Solution().decrypt(arr, 3));
        int[] code = new Solution().decrypt(arr, -2);
        for (int digit : code) {
            System.out.println(digit);
        }
    }
}
