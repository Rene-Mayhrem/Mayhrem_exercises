import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {


    public static void plusMinus (List<Integer> arr) {
        int positive = 0, negative = 0, zeros = 0;

        for(int number: arr) {
            if(number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        System.out.println(String.format("%.6f", positive));
        System.out.println(String.format("%.6f", negative));
        System.out.println(String.format("%.6f", zeros));
    }

    
    public static void main(String[] args) throws Exception {

        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        
        plusMinus(arr);
    }
}
