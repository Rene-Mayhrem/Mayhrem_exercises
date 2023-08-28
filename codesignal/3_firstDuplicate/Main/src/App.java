import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static Map<Integer, Integer> getFrequencyMap (int[] numbers) {
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        //? find for repeated values
        for(int i = 0; i < numbers.length; i++) {
            frequencyMap.put(numbers[i], frequencyMap.getOrDefault(numbers[i], 0) + 1);
        }
        return null;
    }

    public static int getFirstDuplicate (int[] numbers) {
        
        return 0;
    } 

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }


}
