package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Helper method to create a linked list from an array
    private static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to convert a linked list to an array
    private static int[] listToArray(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode list1 = createList(new int[] {1, 2, 4});
        ListNode list2 = createList(new int[] {1, 3, 4});
        ListNode mergedList = solution.mergeTwoLists(list1, list2);
        if (mergedList != null) mergedList.printList();
    }
}