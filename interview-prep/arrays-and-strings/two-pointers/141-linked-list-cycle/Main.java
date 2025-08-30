

public class Main {
    // Helper to create a linked list from array, no cycle
    static ListNode createList(int[] vals) {
        if (vals.length == 0) return null;
        ListNode head = new ListNode(vals[0]);
        ListNode curr = head;
        for (int i = 1; i < vals.length; i++) {
            curr.next = new ListNode(vals[i]);
            curr = curr.next;
        }
        return head;
    }

    // Helper to create a cycle at pos (0-based), or no cycle if pos == -1
    static ListNode createListWithCycle(int[] vals, int pos) {
        if (vals.length == 0) return null;
        ListNode head = new ListNode(vals[0]);
        ListNode curr = head;
        ListNode cycleNode = null;
        if (pos == 0) cycleNode = head;
        for (int i = 1; i < vals.length; i++) {
            curr.next = new ListNode(vals[i]);
            curr = curr.next;
            if (i == pos) cycleNode = curr;
        }
        if (pos != -1) curr.next = cycleNode;
        return head;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test 1: No cycle
        ListNode test1 = createList(new int[]{3,2,0,-4});
        System.out.println("Test 1 (no cycle): " + sol.hasCycle(test1)); // false

        // Test 2: Cycle at pos 1
        ListNode test2 = createListWithCycle(new int[]{3,2,0,-4}, 1);
        System.out.println("Test 2 (cycle at pos 1): " + sol.hasCycle(test2)); // true

        // Test 3: Single node, no cycle
        ListNode test3 = createList(new int[]{1});
        System.out.println("Test 3 (single node, no cycle): " + sol.hasCycle(test3)); // false

        // Test 4: Single node, cycle to self
        ListNode test4 = createListWithCycle(new int[]{1}, 0);
        System.out.println("Test 4 (single node, cycle to self): " + sol.hasCycle(test4)); // true

        // Test 5: Empty list
        ListNode test5 = createList(new int[]{});
        System.out.println("Test 5 (empty list): " + sol.hasCycle(test5)); // false
    }
}
