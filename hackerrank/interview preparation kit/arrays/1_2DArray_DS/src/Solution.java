import java.util.List;
import java.util.Stack;

public class Solution {

  class Subset {
    int i;
    int j;

    Subset(int i, int j) {
      this.i = i;
      this.j = j;
    }

    public void print() {
      System.out.println("i = " + i + " --- j = " + j);
    }
  }

  /*
   * Create a variable to store the max sum -> 0
   * Create the subsets according to the hourglass algorithm -> 16
   * Retrieve the sum of every subset
   * 
   */
  public int hourglassSum(List<List<Integer>> arr) {
    int max = 0;
    Stack<Subset> subsets = getSubsets(arr.size());
    for (Subset subset : subsets) {
      // subset.print();
      max = Math.max(max, getSumSubset(subset, arr));
    }
    return max;
  }

  public int getSumSubset(Subset subset, List<List<Integer>> arr) {
    int sum = 0;
    System.out.println();
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == 1 && (j == 0 || j == 2)) {
          System.out.print(" ");
          continue;
        } else {
          // System.out.print(arr.get(subset.i + i).get(subset.j + j) + " ");
          sum += arr.get(subset.i + i).get(j + subset.j);
        }

      }
      // System.out.println();
    }
    // System.out.println("TOTAL -> " + sum);
    return sum;
  }

  private Stack<Subset> getSubsets(int n) {
    Stack<Subset> subsets = new Stack<>();
    for (int i = 0; (i + 2) < n; i++) {
      for (int j = 0; (j + 2) < n; j++) {
        subsets.add(new Subset(i, j));
      }
    }
    return subsets;
  }
}
