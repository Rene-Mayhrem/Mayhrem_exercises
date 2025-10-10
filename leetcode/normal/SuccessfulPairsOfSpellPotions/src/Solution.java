import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        //? Create array int 
        int[] result = new int[spells.length];
        //? Sort potions array
        Arrays.sort(potions);
        //? Iterate all the elements in spells
        for (int i = 0; i < spells.length; i++) {
            //? Get the first element in potions to satisfy the search
            int firstIndex = binarySearch(potions, spells[i], success);
            result[i] = potions.length - firstIndex;
        }
        return result;
    }

    private int binarySearch (int[] potions, int spell, long success) {
        int low = 0;
        int high = potions.length - 1;
        int firstIndex = potions.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            //? Calculate current value, previous and next
            long product = (long) potions[mid] * spell;
            if (product >= success) {
                firstIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        } 
        return firstIndex;
    }
}
