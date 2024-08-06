import java.util.HashMap;
import java.util.Map;

public class Maps {
  
  
  public static void main(String[] args) {

    MapSolution solution = new MapSolution();

    int[] numbers = {2, 7, 11, 15};
    int[] values = solution.twoSum(numbers, 9);
    for(int value : values) {
      System.out.println(value);
    }
    
  }
}

class MapSolution {

  private HashMap<Integer, Integer> arrayToHashMap (int[] numbers) {
    HashMap<Integer, Integer> numbersMap = new HashMap<>();
    // ? Creating the hash map
    // ! where the key is the value 
    // ! where the value is the index
    for (int i = 0; i < numbers.length; i++) {
      numbersMap.put(numbers[i], i);
    }
    return numbersMap;
  }

  public int[] twoSum (int[] numbers, int target) {
    HashMap<Integer, Integer> numbersMap = this.arrayToHashMap(numbers);
    for (int i = 0; i < numbers.length; i++) {
      int auxComplement = target - numbers[i];
      if (numbersMap.containsKey(auxComplement) && numbersMap.get(auxComplement) != i) {
        return new int[]{i, numbersMap.get(auxComplement)};
        
      }
    }
    return new int[]{};
  }

}
