public class Solution {
  
  //? 1. Establish left and right values -> 1 and n
  // ? 2. Search the value while left <= right
  // ? 3. Establish mid point
  //? 4. Call the api with mid -> res = guess(mid)
  //? 5. According the value -> determine where left and right will go
  public int guessNumber (int n) {
    int left = 1;
    int right = n;
    while (left <= right) {
      int mid = (left + right) / 2;
      // int res = gues(mid)
      int res = 0;
      if (res < 0) {
        right = mid - 1;
      } else if (res > 0) {
        left = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }


}
