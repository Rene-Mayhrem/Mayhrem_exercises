import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    public int[] getTwoSum (int[] numbers, int target) {
        Map<Integer, Integer> numbersMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int newTarget = target - numbers[i];
            if (numbersMap.containsKey(newTarget)) return new int[]{i, numbersMap.get(newTarget)};
            numbersMap.put(numbers[i], i); 
        }
        return new int[]{};
    }

}
