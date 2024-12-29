public class Solution {

  // ? INPUT
  // * nums[] - without constraints -> negative, zeros and positive numbers are allowed
  // ? OUTPUT
  // * int - return the closest value to zero -> without restrictions (negative or positive)
  // * If there are two same values, return the largest value (-1, 1) is the same distance, we return 1 since is the largest
  // ? SOLUTION
  // * Create variables to store the minimal closest value to zero -> intialize it with the first element
  // * Create variable to store the index where the closest value is -> initialize it with zero -> first element
  // * Iterate every element in the array 
  //  * Check the current element distance and choose the min value between current distance and min distance selected
  //  * Assign the index and the minimal value
  // ? RETURN
  // * Return the value at the minimal index  
  public int findClosestNumber (int[] nums) {
    // * auxiliar variables
    int closestDistance = Math.abs(nums[0] - 0);
    int indexClosestDistance = 0;
    // * Iterate over the array element by element
    for (int i = 0; i < nums.length; i++) {
      // * Get the current distance to zero
      int current = Math.abs(nums[i] - 0);
      // * Assign miniaml value to closest variable
      closestDistance = Math.min(closestDistance, current);
      // * If there are two same values, return the largest
      if (closestDistance == current) {
        indexClosestDistance = (nums[i] > 0) ? i : indexClosestDistance;
      }
    }
    return indexClosestDistance;
  }

  public int findClosestNumber2 (int[] nums) {
    int min = Math.abs(nums[0]);
    int index = 0;
    for (int i = 1; i < nums.length; i++) {
      int current = Math.abs(nums[i]);
      if (current == min && nums[i] > 0) {
        index = i;
      }
      if (current < min) {
        min = current;
        index = i;
      }
    }
    return nums[index];
   }
}
