import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Result {
  public static void miniMaxSum (List<Integer> arr) {
    // int min = arr.stream().sorted().limit(4).mapToInt(Integer::intValue).sum();
    // int max = arr.stream().sorted().skip(1).mapToInt(Integer::intValue).sum();
    Collections.sort(arr);
    System.out.println(arr.toString());
    long minSum = arr.get(0); //? first element
    long maxSum = arr.get(arr.size() - 1); //? last element
     
    for(int i = 1; i < arr.size() - 1; i++) {
      minSum += arr.get(i);
      maxSum += arr.get(i);
    }

    System.out.println(minSum+" "+maxSum);
  }
}

public class Hackerrank {


  public static void main(String[] args) {
    Result result = new Result();
    
    List<Integer> arr = new ArrayList<>();
    arr.add(2);
    arr.add(3);
    arr.add(1);
    arr.add(1);
    arr.add(2);

    result.miniMaxSum(arr);
  }

}