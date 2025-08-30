class ListNode {
    int val;
    ListNode next;
    ListNode (int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {

    public boolean hasCycle (ListNode head) {
        // Use a two pointer -> fast & slows 
        // Slow is going to move one node
        // Fast is going to move two nodes
        // Traverse the linked list while fast and slow are different than null, if theypre null that means they reached the end
        // If there's any cycle in the LL fast and slow will be the same node respectively
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
    

    
}
