import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int kthFactor (int n, int k) {
    // ? Create a list
    //? Iterate starting from 1 to n
    //? Ask if number i is factor of n -> add number
    // ? Ask if factor count is equal to k -> return factor count index i
    List<Integer> factors = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) factors.add(i);
    }
    return (k <= factors.size()) ? factors.get(k - 1) : - 1;
  }
}
