import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

// FILE: src/SolutionTest.java

class SolutionTest {
  class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  @Test 
  void testLevelOrderSingleElement() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(List.of(1));
    assertEquals(expected, solution.levelOrder(root));
  }

  @Test
  void testLevelOrderMultipleLevels() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);

    List<List<Integer>> expected = new ArrayList<>();
    expected.add(List.of(1));
    expected.add(List.of(2, 3));
    expected.add(List.of(4, 5, 6, 7));

    assertEquals(expected, solution.levelOrder(root));
  }

  @Test
  void testLevelOrderNullRoot() {
    Solution solution = new Solution();
    assertNull(solution.levelOrder(null));
  }
}