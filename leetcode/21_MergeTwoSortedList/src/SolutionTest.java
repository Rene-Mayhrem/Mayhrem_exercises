import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

// src/ListNodeTest.java


public class SolutionTest {

  @Test
  public void testDefaultConstructor() {
    ListNode node = new ListNode();
    assertEquals(0, node.val);
    assertNull(node.next);
  }

  @Test
  public void testConstructorWithVal() {
    ListNode node = new ListNode(5);
    assertEquals(5, node.val);
    assertNull(node.next);
  }

  @Test
  public void testConstructorWithValAndNext() {
    ListNode nextNode = new ListNode(10);
    ListNode node = new ListNode(5, nextNode);
    assertEquals(5, node.val);
    assertEquals(nextNode, node.next);
  }
}