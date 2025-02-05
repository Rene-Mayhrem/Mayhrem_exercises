import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {


    public static void plusMinus (List<Integer> arr) {
        // ? auxiliar variables 
        double positive = 0, negative = 0, zeros = 0;
        // ? initial conditions; determine which type of value is stored as a number
        for(int number: arr) {
            if(number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        // ? Printing final results
        System.out.println(String.format("%.6f", positive/arr.size()));
        System.out.println(String.format("%.6f", negative/arr.size()));
        System.out.println(String.format("%.6f", zeros/arr.size()));
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
