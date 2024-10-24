public class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }

  ListNode() {}

  public void append (int val) {
    ListNode newNode = new ListNode(val);
    if (this.next == null) {
      this.next = newNode;
    } else {
      ListNode current = this.next;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public void print() {
    ListNode current = this;
    while (current != null) {
      System.out.println(current.val);
      current = current.next;
    }
  }

}
