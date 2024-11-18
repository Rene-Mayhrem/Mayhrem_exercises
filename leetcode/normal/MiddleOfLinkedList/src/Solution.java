public class Solution {

  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode middleNode (ListNode head) {
    //? "tortoise and hare" algorith
    //? Create two pointers
    ListNode slow = head;
    ListNode fast = head;
    //? While the next values of next are not null
    while (fast != null && fast.next != null) {
      //? slow moves of one and fast moves with two
      slow = slow.next;
      fast = fast.next.next;
    }
    //? returns slow due to fast moves to the end and slow will be at the end
    return slow;
  }

}
