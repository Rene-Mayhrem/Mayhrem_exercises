import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Solution sol = new Solution();
        sol.findPermutationDifference("abc", "bca");
    }
}

class Solution {

    public HashMap<String, Integer> stringToMap (String string) {
        HashMap<String, Integer> map = new HashMap<>();
        char[] arrayString = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            map.put(String.valueOf(arrayString[i]) , i);
        }
        return map;
    }

    public int findPermutationDifference (String s, String t) {
        ArrayList<HashMap<String, Integer>> strings = new ArrayList<>();
        strings.add(stringToMap(s));
        strings.add(stringToMap(t));
        for (HashMap<String, Integer> string : strings) {
            System.out.println(string);
        }
        return 0;
    }
}