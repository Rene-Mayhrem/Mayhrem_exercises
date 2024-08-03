import java.util.HashMap;

public class Maps {
  
  
  public static void main(String[] args) {

    Solution solution = new Solution();

    int[] numbers = {2, 7, 11, 15};

    System.out.println("Test");

    solution.twoSum(numbers, 9);
    
  }
}

class Solution {
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
