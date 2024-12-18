public class Solution {

  //? INPUT:
  //? nums[] -> constrains - non negative numbers
  //? RETURN:
  //? k -> represents the total of elements after removing val
  //? nums[] -> move val to the last positions
  //? SOLUTION
  //? left and right -> indices (0, nums.length - 1)
  //? left -> pointer for values different than val
  //? right -> pointer for values equal than val
  //? swaps -> number of changed places (indices)
  //? Iterate while left <= righ
    //? Check if value at index right is val then decrement
    //? Check if value at index left equal than val - swap places index left and right and increment swaps
 

  public int removeElement (int[] nums, int val) {
    int left = 0;
    int right = nums.length - 1;
    int swaps = 0;
    while (left <= right) {
      if (nums[right] == val) {
        right--;
        swaps++;
      }
      if (nums[left] == val) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        swaps++;
      }
      left++;
    }
    System.out.println("numbers");
    for (int num : nums) System.out.println(num);
    System.out.println("Result");
    return nums.length - swaps;
  }


  public int removeElementSolution (int[] nums, int val) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[k] = nums[i];
        k++;
      }
    }
    for (int num : nums) System.out.println(num);
    return k;
  }
}
