public class Solution {
  /*
   * Given a number "x" return "x" with its digits reversed, if value to go outside the 32-bit integer range -> return 0
   * Create a function swap to swap between digits
   * Negative number -> left point starts at i = 1
   * Positive number -> left point starts at i = 0
   */
  public int reverse (int x) {
    char[] num = String.valueOf(x).toCharArray();
    int left;
    try {
      if (x < 0) {
        left = 1;
        return swap(left, num)*(-1);
      } else {
        left = 0;
        return swap(left, num);
      }
    } catch (Exception e) {
      return 0;
    }
  }

  private int swap (int left, char[] num) {
    String res = "";
    for (int i = num.length - 1; i >= left; i--) {
      res += num[i];
    }
    return Integer.parseInt(res);
  } 
}
