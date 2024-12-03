public class Solution {
  public String addSpaces (String str, int[] spaces) {
    StringBuilder strBuilder = new StringBuilder(str);
    int offset = 0;
    for (int element : spaces) {
      System.out.println("space "+element);
      strBuilder.insert(element + offset, " ");
      offset++;
    }
    System.out.println(strBuilder.toString());
    return strBuilder.toString();
  }
}
