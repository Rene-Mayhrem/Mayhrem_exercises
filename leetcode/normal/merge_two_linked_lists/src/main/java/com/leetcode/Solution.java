package com.leetcode;

public class Solution {
  public ListNode mergeTwoLists (ListNode list1, ListNode list2) {
    if (list1 == null && list2 == null) return null;
    ListNode mergedList = list1;
    ListNode currentList1 = list1;
    ListNode currentList2 = list2;
    while (currentList1 != null && currentList2 != null) {
      if (currentList1 != null) System.out.println("l1 -> "+currentList1.val);
      if (currentList2 != null) System.out.println("l2 -> "+currentList2.val);
      try {
        if (currentList1.val > currentList2.val) {
          mergedList.next = currentList1;
          currentList1 = currentList1.next;
        } else {
          mergedList.next = currentList2;
          currentList2 = currentList2.next;
        }
        // System.out.println("Try");
      } catch (Exception e) {
        if (currentList1 != null) {
          mergedList.next = currentList1;
          currentList1 = currentList1.next;
        } 
        if (currentList2 != null) {
          mergedList.next = currentList2;
          currentList2 = currentList2.next;
        }
        // System.out.println("Catch");
      }
      
    }
    
    return mergedList;
  }  
}
