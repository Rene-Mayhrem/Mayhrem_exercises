public class Solution {

  // ? 1. Establish left and right values -> 1 and n
  // ? 2. Search the value while left <= right
  // ? 3. Establish mid point
  // ? 4. Call the api with mid -> res = guess(mid)
  // ? 5. According the value -> determine where left and right will go
  public int guessNumber(int n) {
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

  // We are playing the Guess Game. The game is as follows:

  // I pick a number from 1 to n. You have to guess which number I picked.

  // Every time you guess wrong, I will tell you whether the number I picked is
  // higher or lower than your guess.

  // You call a pre-defined API int guess(int num), which returns three possible
  // results:

  // -1: Your guess is higher than the number I picked (i.e. num > pick).
  // 1: Your guess is lower than the number I picked (i.e. num < pick).
  // 0: your guess is equal to the number I picked (i.e. num == pick).
  // Return the number that I picked.

  // Example 1:

  // Input: n = 10, pick = 6
  // Output: 6
  // Example 2:

  // Input: n = 1, pick = 1
  // Output: 1
  // Example 3:

  // Input: n = 2, pick = 1
  // Output: 1

  //? INPUT -> 
  //? Establish low and high -> start and final
  //? Iterate through game while low <= high
  //? Establish middle point by calling API -> mid = guess(int num)
  //? Move low and high depending value
  //? Move pointers again
  public int guessNumber (int n) {
    int low = 1;
    int high = n;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      int currentStatus = guess(mid);
      if (currentStatus < 0) {
        high = mid - 1;
      } else if (currentStatus > 0) {
        low = mid + 1;
      } else return mid;
    } 
  }

}
