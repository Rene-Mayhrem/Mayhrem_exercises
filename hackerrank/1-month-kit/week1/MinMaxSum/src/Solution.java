import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(3);
    arr.add(5);
    arr.add(7);
    arr.add(9);
    Result result = new Result();
    result.miniMaxSunm(arr);
  }
}

class Result { 

  public void miniMaxSunm (List<Integer> arr) {

    //? Sort list of numbers
    arr = new ListSort(arr).sortList();
    //? Getting minimun sum
    int min = arr.stream().limit(4).mapToInt(Integer::intValue).sum();
    //? Getting maximum sum
    int max = arr.stream().skip(1).mapToInt(Integer::intValue).sum();
    System.out.println(min+" "+max);
    
  }

}

class ListSort {

  private List<Integer> numberList;

  public ListSort (List<Integer> numberList) {
    this.numberList = numberList;
  }

  public List<Integer> sortList () {
    for(int lastSortedIndex = this.numberList.size() - 1; lastSortedIndex >= 0; lastSortedIndex--) {
      for (int currentIndex = 0; currentIndex < lastSortedIndex; currentIndex++) {
        if(this.numberList.get(currentIndex) > this.numberList.get(currentIndex + 1)) {
          swapElements(currentIndex, currentIndex + 1);
        }
      }
    }
    return this.numberList;
  }

  private void swapElements (int currentIndex, int targetIndex) {
    if (currentIndex == targetIndex) {
      return;
    }
    int temporal = this.numberList.get(currentIndex);
    this.numberList.set(currentIndex, this.numberList.get(targetIndex));
    this.numberList.set(targetIndex, temporal);
  }
}