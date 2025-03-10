public class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) return null;

    ListNode current = head;

    while(current != null && current.next != null) {
      if (current.val == current.next.val) {
        ListNode temp = current.next;
        current.next = current.next.next;
        temp.next = null;
      } else {
        current = current.next;
      }
    }

    return head;
  }
}

