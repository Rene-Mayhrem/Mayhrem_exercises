public class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    while(head.next != null) {
      if (head.val == head.next.val) {
        ListNode temp = head.next;
        head.next = head.next.next;
        temp.next = null;
      }
      head = head.next;
    }
    return head;
  }
}
