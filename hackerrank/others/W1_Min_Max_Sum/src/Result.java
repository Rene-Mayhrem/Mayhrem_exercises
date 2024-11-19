import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {
  public void miniMaxSum (List<Integer> arr) {
    //? Create a mutable copy of the list
    List<Integer> list = new ArrayList<>(arr);
    //? Sort list
    Collections.sort(list);
    System.out.println(list);
    //? Create min by summing the first four elements
    long min = list.stream().limit(4).mapToLong(Integer::longValue).sum();
    //? Create max by summing the last four elements 
    long max = list.stream().skip(arr.size() - 4).mapToLong(Integer::longValue).sum();
    //? Print all the results
    System.out.println(min+" "+max);
  }
}
