import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    //? INPUT
    //? String paragraph 
    //? Array of String -> Banned words
    //? (paragraph) upper-case, non-alphanumerical characters such as commas, and more
    //? (banned) lowercase 
    //? APROACH
    //? Clean the paragraph for just lowercase words -> normalize lowercase and non-letters
    //? Go from array to Set 
    //? HashMap for the words -> key : value
    //?                          word : count
    //? 
    public String mostCommonWord (String paragraph, String[] banned) {
        String normalizedParagraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) bannedSet.add(word.toLowerCase());
        
        Map<String, Integer> frequency = new HashMap<>();

        int max = 0;
        String mostCommon = "";

        for (String word : normalizedParagraph.split(" ")) {
            if (bannedSet.contains(word)) continue;
            int count = frequency.getOrDefault(word, 0) + 1;
            frequency.put(word, count);
            if (count > max) {
                max = count;
                mostCommon = word;
            }
        }
        return mostCommon;
    }

}
