import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Result result = new Result();
        int n = 7;
        List<Integer> arr = List.of(1, 2, 1, 2, 1, 3, 2);
        System.out.println("Total of pairs: "+result.sockMerchant(n, arr));
    }
}
