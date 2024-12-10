public class Solution {
  public int search (int[] nums, int target) {
    int low = 0, high = nums.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (nums[mid] < target) {
        low = mid + 1;
      } else if (nums[mid] > target) {
        high = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public int searchTry (int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while(left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] < target) {
        left = mid + 1;
      } else if (nums[mid] > target) {
        right = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public int searchRecursive (int[] nums, int target) {
    return binarySearch(nums, 0, nums.length - 1, target);
  }

  public int binarySearch (int[] nums, int left, int right, int target) {
    if (left > right) {
      return -1;
    }
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) {
      return mid;
    } else if (nums[mid] < target) {
      return binarySearch(nums, mid + 1, right, target);
    } else {
      return binarySearch(nums, left, mid - 1, target);
    }
  }
}
