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

  public String addSpacesInString (String str, int[] spaces) {
    StringBuilder result = new StringBuilder();
    int offset = 0;
    for (int index = 0; index < str.length(); index++) {
      if (offset < spaces.length && index == spaces[offset]) {
        result.append(' ');
        offset++;
      } 
      result.append(str.charAt(index));
    }
    return result.toString();
  }
}
