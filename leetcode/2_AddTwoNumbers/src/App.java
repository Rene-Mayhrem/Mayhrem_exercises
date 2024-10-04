

import org.w3c.dom.ls.LSException;

public class App {
    public static void main(String[] args) throws Exception {
       
    }
}


class Solution {
    public ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode ans = temp;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int firstNode = (l1 != null) ? l1.val : 0; 
            int secondNode = (l2 != null) ? l2.val : 0;

            int sum = carry + (firstNode + secondNode);

            carry = sum / 10;
            ans.next = new ListNode(sum%10);
            ans = ans.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return temp.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
          
    }
}