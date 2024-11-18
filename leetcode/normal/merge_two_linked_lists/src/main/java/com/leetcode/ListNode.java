package com.leetcode;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode () {}

  public ListNode (int val) {
    this.val = val;
  }

  public ListNode (int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public void append(int newVal) {
    ListNode newNode = new ListNode(newVal);
    ListNode current = this;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
  }

  // Method to print the list
  public void printList() {
    ListNode current = this;
    while (current != null) {
      System.out.print(current.val + " ");
      current = current.next;
    }
    System.out.println();
  }
}

