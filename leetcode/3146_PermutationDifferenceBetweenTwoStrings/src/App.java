import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        System.out.println(sol.findPermutationDifference("abc", "bac"));
        System.out.println(sol.findPermutationDifferenceBetter("abc", "bac"));
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
        HashMap<String, Integer> mapS = stringToMap(s);
        HashMap<String, Integer> mapT = stringToMap(t);
        int permutationDifference = 0;
        for (char character : s.toCharArray()) {
            permutationDifference += Math.abs(mapS.get(String.valueOf(character)) - mapT.get(String.valueOf(character)));
        }
        return permutationDifference;
    }

    public int findPermutationDifferenceBetter (String s, String t) {
        HashMap<String, Integer> map = stringToMap(s);
        int permutationDifference = 0;
        for (int i = 0; i < t.length(); i++) {
            permutationDifference += Math.abs(map.get(String.valueOf(t.charAt(i))) - i);
        }
        return permutationDifference;
    }
}