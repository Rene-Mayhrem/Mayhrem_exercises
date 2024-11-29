

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        new Solution().addTwoNumbers(l1, l2);
    }
}
