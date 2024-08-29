public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Solution {
    public int lengthOfLastWord (String word) {
        String[] words = word.strip().split(" ");
        return words[words.length - 1].length();
    }
}