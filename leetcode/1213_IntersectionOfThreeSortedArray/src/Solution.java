import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {

  public List<Integer> arraysIntersection (int[] arr1, int[] arr2, int[] arr3) {
    //? Create a set of arr2 and arr3
    // ? Create an empty list of integers
    //? Iterate first arr1 -> all elements
      //? check if set of arr2 and arr3 contains element
        //? TRUE -> add element to the list
    // ? return the list
    List<Integer> result = new ArrayList<>();
    HashSet<Integer> set2 = arrayToSet(arr2);
    HashSet<Integer> set3 = arrayToSet(arr3);
    for (int element : arr1) {
      if (set2.contains(element) && set3.contains(element)) result.add(element);
    }

    return result;
  }

  private HashSet<Integer> arrayToSet (int[] arr) {
    HashSet<Integer> result = new HashSet<>();
    for (int element : arr) {
      result.add(element);
    }
    return result;
  }
}
