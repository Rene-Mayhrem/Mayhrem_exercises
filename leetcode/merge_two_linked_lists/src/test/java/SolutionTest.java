import com.leetcode.ListNode;
import com.leetcode.Solution;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class SolutionTest {

  // Helper method to create a linked list from an array
  private ListNode createList(int[] values) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    for (int value : values) {
      current.next = new ListNode(value);
      current = current.next;
    }
    return dummy.next;
  }

  // Helper method to convert a linked list to an array
  private int[] listToArray(ListNode head) {
    List<Integer> result = new ArrayList<>();
    while (head != null) {
      result.add(head.val);
      head = head.next;
    }
    return result.stream().mapToInt(i -> i).toArray();
  }

  @Test
  public void testMergeTwoLists() {
    Solution solution = new Solution();

    ListNode list1 = createList(new int[]{1, 2, 4});
    ListNode list2 = createList(new int[]{1, 3, 4});
    ListNode mergedList = solution.mergeTwoLists(list1, list2);
    mergedList.printList();
    assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, listToArray(mergedList));

    list1 = createList(new int[]{});
    list2 = createList(new int[]{});
    mergedList = solution.mergeTwoLists(list1, list2);
    if (mergedList != null) mergedList.printList();
    assertArrayEquals(new int[]{}, listToArray(mergedList));

    list1 = createList(new int[]{});
    list2 = createList(new int[]{0});
    mergedList = solution.mergeTwoLists(list1, list2);
    mergedList.printList();
    assertArrayEquals(new int[]{0}, listToArray(mergedList));
  }
}