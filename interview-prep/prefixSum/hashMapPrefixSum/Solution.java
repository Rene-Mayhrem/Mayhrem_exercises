package prefixSum.hashMapPrefixSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int subarraySum (int[] nums, int k) {
        int count = 0;
        int currentSum = 0; // tracking sum for prefixSum
        Map<Integer, Integer> frequency = new HashMap<>();
        frequency.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            int target = currentSum - k;
            if (frequency.containsKey(target)) {
                count += frequency.get(target);
            }
            frequency.put(currentSum, frequency.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}
