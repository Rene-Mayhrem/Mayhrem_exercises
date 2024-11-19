import java.util.List;
import java.util.Stack;

public class Solution {
  /*
   * PROBLEM -> Get the highest hourglass sum
   * INPUT -> 6x6 2D array
   * OUTPUT -> input -with the highest sum of hourgalss
   * SOLUTION 
   * Create a stack with the limits of the hourglass 
   * Create a maxSum variable
   * Start iterating the 2D array with the stack values
   * 
   */
  class Hourglass {
    int xStart;
    int xEnd;
    int yStart;
    int yEnd;
    
    public Hourglass (int xStart, int xEnd, int yStart, int yEnd) {
      this.xEnd = xEnd;
      this.xStart = xStart;
      this.yStart = yStart;
      this.yEnd = yEnd;
    }

    public void print () {
      System.out.println("x1->"+xStart+" x2->"+xEnd+" y1>"+yStart+" y2->"+yEnd);
    }
  }
  private Stack<Hourglass> buildHourglassSubset (int n) {
    Stack<Hourglass> subsets = new Stack<>();
    for (int i = 0 ; (i + 2) < n; i++) {
      for (int j = 0; (j + 2) < n; j++) {
        subsets.add(new Hourglass(i, i + 2, j, j +2 ));
      }
    }
    return subsets;
  }

  public int hourglassSum (List<List<Integer>> arr) {
    Stack<Hourglass> subsets = buildHourglassSubset(arr.size());
    int maxSum = 0;
    for (Hourglass subset : subsets) {
      while (subset.xStart <= subset.xEnd) {
        while (subset.yStart <= subset.yEnd) {
          
        }
      }
    }
    return 0;
  }
}
