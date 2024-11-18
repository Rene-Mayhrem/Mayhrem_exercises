import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Solution {
    public boolean containsDuplicate (int[] nums) {
        HashSet<Integer> setNums = new HashSet<>();
        for (int num : nums) {
            if (setNums.contains(num)) {
                return true;
            }
            setNums.add(num);
        }
        return false;
    }

    public List<Integer> containsDuplicates (int[] nums) {
        HashSet<Integer> setOfNums = new HashSet<>();
        // HashSet<Integer> setOfDuplicates = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for (int num : nums) {
        if (setOfNums.contains(num) && !duplicates.contains(num)) {
                duplicates.add(num); 
            }
            setOfNums.add(num);
        }
        return duplicates;
    }
 }