import java.util.HashMap;
import java.util.HashSet;

public class Solution {

  //? Create a hashmap to check number of occurences -> key - value (arr number , times that appears)
  //? Create a hashmap
  //? Iterate through the arr 
    //? Insert the element and increment the time it appears
  //? Create a hashset to store the times it apears
  //? Iterate the value collection
    //? Check if the element does exist -> return false
  //? 
   
  public boolean uniqueNumberOfOccurences (int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    HashSet<Integer> set = new HashSet<>();
    for (int number : arr) {
      map.put(number, map.getOrDefault(number, 0) + 1);
    }
    System.out.println(map);
    for (Integer value : map.values()) {
      if (set.contains(value)) return false;
      set.add(value);
    }
    return true;
  }

}
