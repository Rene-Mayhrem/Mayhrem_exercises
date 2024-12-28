public class Solution {
  public int largestAltitude (int[] gains) {
    int currentSum = 0;
    int highestAltitude = currentSum;
    for (int gain : gains) {
      currentSum += gain;
      highestAltitude = Math.max(currentSum, highestAltitude);
    }
    return highestAltitude;
  }
}
