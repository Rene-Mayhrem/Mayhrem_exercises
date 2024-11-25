import java.util.HashMap;

public class Solution {

  //? Create a hashmap to check number of occurences -> key - value (arr number , times that appears)
  //? Create a hashmap
  //? Iterate through the arr 
    //? Insert the element and increment the time it appears
  //? Create a hashset to store the times it apears
   
  public boolean uniqueNumberOfOccurences (int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int number : arr) {
      map.put(number, map.getOrDefault(number, +1));
    }
    System.out.println(map);
    return false;
  }

}
