public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        String str = "i love eating burger";
        String search = "burg";
        System.out.println(new Solution().isPrefixOfWord(str, search));
    }
}
