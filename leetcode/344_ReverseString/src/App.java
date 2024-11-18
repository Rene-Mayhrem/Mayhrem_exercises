public class App {
    public static void main(String[] args) throws Exception {
        String word = "Hello leetcode";
        char[] characters = word.toCharArray();
        new Solution().reverseString(characters);
        for (Character character : characters) { 
            System.out.println(character);
        }
        new Solution().reverseStringTwoPointers(characters);
        for (Character character : characters) System.out.println(character);
    }
}
