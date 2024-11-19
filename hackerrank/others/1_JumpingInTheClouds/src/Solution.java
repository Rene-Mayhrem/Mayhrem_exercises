import java.util.List;

public class Solution {
  public int jumpingOnClouds(List<Integer> clouds) {
    // ? input -> List of integers
    // ? output -> int -> min of jumps
    /*
     * DESCRIPTION:
     * elements of my list -> 0 or 1
     * 0 -> safe
     * 1 -> avoid
     * The user can jump -> once or twice (depending the list values)
     * SOLUTION:
     * Initalize a variable called jumps -> 0
     * Iterate my list -> starting from 0
     * Iterate until j = 2 or cloud element = 1
     * Increase jump by one
     * CONSTRAINTS:
     * 1. The max jump a user can achieve, it's two -> if there are three zeros, we
     * split the jump in (0,0), (0)
     * 2. If the max jump a user can achieve is two -> what happened in case of
     * three ones? or we return
     * 
     * 0 0 1 0 0 1 0
     * (0 - 1) -> (3 - 4) -> (5)
     * Initialize var -> i = 0 (for iteration)
     * Initialize var jumps -> jumps = 0 (for recording jumps)
     * Iterate through the List by index
     * Check if the current element is 0
     * Initialize a var -> consecutiveJumps = 1
     * While consecutiveJumps <= 2 && clouds.get(i) == 0
     * Increase i and increase consecutiveJumps
     * Increase jumps
     */

    int jumps = 0, i = 0;
    while (i < clouds.size()) {
      System.out.println("x -> " + i + " = " + clouds.get(i));
      if (clouds.get(i) == 0) {
        int consecutiveJumps = 1;
        if (i == clouds.size() - 1) {
          jumps++;
          i++;
        } else {
          while (consecutiveJumps <= 2 &&
              clouds.get(i) == 0) {
            i++;
            consecutiveJumps++;
          }
          System.out.println("index -> " + i);
          jumps++;
        }
      } else {
        i++;
      }
    }
    return jumps;
  }

  public int jumpingOnClouds2 (List<Integer> clouds) {
    int i = 0, jumps = 0;
    while (i < clouds.size() - 1) {
      if (i + 2 < clouds.size() && clouds.get(i + 2) == 0) {
        i += 2;
      } else {
        i += 1;
      }
      jumps++;
    } return jumps;
  }
}
