import java.util.HashMap;

public class Maps {
  
  
  public static void main(String[] args) {

    MapSolution solution = new MapSolution();

    int[] numbers = {2, 7, 11, 15};

    System.out.println("Test");

    solution.twoSum(numbers, 9);

    System.out.println("What's going in here?");
    
  }
}

class MapSolution {
  public int[] twoSum (int[] numbers, int target) {
    System.out.println("Hello");
    HashMap<Integer, Integer> numbersMap = new HashMap<>(); 
    for (int i = 0; i < numbers.length; i++) {
      numbersMap.put(i, numbers[i]);
      System.out.println("Print");
    }
    System.out.println(numbersMap);
    return null;
  }
}
