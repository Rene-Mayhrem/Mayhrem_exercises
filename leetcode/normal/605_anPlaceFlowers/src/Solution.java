public class Solution {
  /*
   *  We have a flowerbed in which some plots are used and others are avaiable.
   * 0 = empty and avaialble
   * 1 = used
   * 
   * RULE: 
   * We cannot have adjacent plots = [1, 1] this is not allowed
   * 
   * OBJECTIVE:
   * Return if a "n" of new flower can ble planted in the current flowerbed and following the solution
   * 
   * 
   * [1, 0, 0, 0, 1] = 1 => n = 1
   * [1, 0, 1, 0, 1] = n = 0 = true
   * 
   * [1, 0, 0, 0, 1] => n = 2
   * [1, 0, 1, 0, 1] => n = 1
   * 
   * [0, 0,  1, 0, 0, 1, 0, 0, 1]
   * 
   * before = null
   * current = 0
   * after = 1; 
   * null, 1, 0
   * -------
   * before = 0
   * current = 1
   * after = 2
   * 1, 0, 0
   * 
   * FIRST SOLUTION(
   * Create a copy of flowerbed (not modify flowerbed array)
   * int before = -1
   * int current = 0
   * int after = 1;
   * Iterate the flowerbed while current < flowerbed lenght
    * Check if current plot is empty
     * Check before and after plots, if they are empty too, use it 
   */

  public boolean canPlaceFlowers (int[] flowerbed, int n) {
    int before = -1, current = 0, after = 1;
    while (current < flowerbed.length) {
      if (n == 0) return true;
      if (flowerbed[current] == 0) {
        if (before < 0) {
          if (flowerbed[after] == 0) {
            n--;
            flowerbed[current] = 1;
          }
        } else if (after == flowerbed.length) {
          if (flowerbed[before] == 0) {
            n--;
            flowerbed[current] = 1;
          }
        } else if (flowerbed[before] == 0 && flowerbed[after] == 0) {
          n--;
          flowerbed[current] = 1;
        }
      }
      before++;
      current++;
      after++;
    }
    return n == 0;
  }

  public boolean placeFlowers (int[] flowerbed, int n) {
    int[] copy = flowerbed.clone();
    for (int i = 0; i < copy.length; i++) {
      if (n == 0) return true;
      if (copy[i] == 0) {
        boolean isLeftEmpty = (i == 0) || (copy[i - 1] == 0);
        boolean isRigthEmpty = (i == copy.length - 1) || (copy[i + 1] == 0);

        if (isLeftEmpty && isRigthEmpty) {
          n--;
          copy[i] = 1;
          i++;
        }
      }
    }
    return (n == 0);
  }
}
