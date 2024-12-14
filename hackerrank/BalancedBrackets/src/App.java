public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        System.out.println(new Solution().isBalanced("{[()]}"));
        System.out.println("---------------");
        System.out.println(new Solution().isBalanced("{}}}((}}}}]]]))}"));
        System.out.println("---------------");
        System.out.println(new Solution().isBalanced("{{[[(())]]}}"));
        
    }
}
