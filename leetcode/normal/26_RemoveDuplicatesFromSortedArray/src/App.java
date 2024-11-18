import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Solution sol = new Solution();
        System.out.println(sol.removeDuplicates(nums));
    }
}

class Solution {
    public int removeDuplicates (int[] nums) {
        HashSet<Integer> setOfNums = new HashSet<>();
        for (int num : nums) {
            setOfNums.add(num);
        }
        System.out.println(setOfNums);
        return setOfNums.size();
    }
}