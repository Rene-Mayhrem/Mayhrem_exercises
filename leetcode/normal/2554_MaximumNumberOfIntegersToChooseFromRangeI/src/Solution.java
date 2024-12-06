import java.util.HashSet;

public class Solution {
  public int maxCount (int[] banned, int n, int maxCount) { 
      // ? Create a HashMap
      //? Iterate from n to 1 
      // ? Check if number doesn'nt exist in the hashset
      // ? CHeck if sum <= masCount and add the value
      // HashSet<Integer> nums = new HashSet<>();
      // for (int num : banned) {nums.add(num);}
      // int sum = 0, count = 0;
      // for (int i = n; i > 0; i--) {
      //   System.out.println(i);
      //   if (!nums.contains(i) &&
      //       sum <= maxCount &&
      //       i <= maxCount) {
      //     sum += i;
      //     count++;
      //     System.out.println("--->"+sum);
      //   }
      // }
      HashSet<Integer> bannedCounts = new HashSet<>();
      for (int num : banned) {bannedCounts.add(num);}
      int sum = 0, count = 0;
      for (int i = 1; i <= n; i++) {
        if (!bannedCounts.contains(i) &&
            (sum + i) <= maxCount
        ) {
          System.out.println("->"+i);
          sum += i;
          count++;
        }
      }
    return count;
  }
}
