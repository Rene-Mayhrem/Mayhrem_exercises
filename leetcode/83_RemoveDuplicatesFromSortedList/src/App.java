public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ListNode head = new ListNode();
        head.val = 1;
        head.append(1);
        head.append(2);
        head.append(3);
        head.append(3);

        head.print();
        head.deleteDuplicates(head);
        System.out.println("Deleted duplicated");
        head.print();
    }
}
