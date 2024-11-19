import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Solution solution = new Solution();
        System.out.println(solution.lonelyInteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
    }
}

class Solution {
    public static int lonelyInteger (List<Integer> a) {
        HashMap<Integer, Integer> integerMap = new HashMap<>();
        for (int number : a) {
            //? Creating a hashMap by number and the times of occurence
            integerMap.put(number, integerMap.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            //! There is the constraint that says that always is going to exist one number with one occurence
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}