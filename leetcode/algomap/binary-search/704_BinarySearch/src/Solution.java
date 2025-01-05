public class Solution {
  //? BINARY SEARCH
  // //? STATEMENT
  // ? Given an array of nums which are sorted in ascending order, and an integer target. Write a function to search target in nums, if exists return the index, otherwise return -1.
  // ? GOAL -> Write the algorithm in O(log n)
  //? INPUT 
  // * Array of integers -> Ascending order
  //? OUTPUT
  // * Return the index of the target if exists in the array, otherwise return -1
  // ? SOLUTION
  // * Define start and end pointers as 0 and nums length - 1
  // * Iterate while start < end
  //   * Get the middle point between start and end by -> (start + (start - end)) / 2
  //   * Identify the target and define the start and end pointers


  public int search (int[] nums, int target) {
    // ! Create pointers from end and start
    int start = 0, end = nums.length - 1;
    // ! Iterate through the nums array while the first pointer is less or equal than the second pointer
    while (start < end) {
      // ! Create mid pointer between start and end
      int mid = (start + (end - start)) / 2;
      // ? The value at mid point is less than the target -> we search in the other part of the array
      if (nums[mid] < target) {
        start = mid + 1;
      // ? The value at mid point is greather than the target -> we search in the other part of the array
      } else if (nums[mid] > target) {
        end = mid - 1;
      // ? In other part the value has been found return the index > mid
      } else return mid;
    }
    // ? The value has not been found -> return -1
    return -1;
  }
}
