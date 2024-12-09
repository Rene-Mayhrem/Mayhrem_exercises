public class Pair {
  
  private TreeNode node;
  private int level;

  public Pair (TreeNode node, int level) {
    this.node = node;
    this.level = level;
  }

  public TreeNode getNode() {
    return node;
  }

  public void setNode(TreeNode node) {
    this.node = node;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }
}
