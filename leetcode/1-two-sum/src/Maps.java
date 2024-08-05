import java.util.HashMap;

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
    // ? Creating the hash map, where the key is thwe index and the value is the element in the selected index.
    for (int i = 0; i < numbers.length; i++) {
      numbersMap.put(i, numbers[i]);
    }
    return numbersMap;
  }

  public int[] twoSum (int[] numbers, int target) {
    HashMap<Integer, Integer> numbersMap = this.arrayToHashMap(numbers);
    int[] values = new int[2];
    System.out.println(numbersMap);
    numbersMap.forEach((key, value) -> {
      if(value <= target) {
        Integer aux = Math.abs(target - value);
        if (numbersMap.containsValue(aux)) {
          values[0] = key;
          values[1] = numbersMap.getOrDefault(key, aux);
        }
      }

    });

    
    return values;
  }

}
