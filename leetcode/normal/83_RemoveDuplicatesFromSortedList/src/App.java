public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ListNode head = new ListNode();
        Solution solution = new Solution();
        head.val = 1;
        head.append(1);
        head.append(2);
        // head.append(3);
        // head.append(3);
        head.print();
        System.out.println("Duplicates removed");
        solution.deleteDuplicates(head);
        head.print();

    }
}
