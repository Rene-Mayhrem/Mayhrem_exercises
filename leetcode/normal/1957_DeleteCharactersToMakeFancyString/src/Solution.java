public class Solution {
  public String makeFancyString (String str) {
    if (str.length() < 3) return str;
    StringBuilder result = new StringBuilder();
    result.append(str.charAt(0));
    result.append(str.charAt(1));
    for (int i = 2; i < str.length(); i++) {
      if (str.charAt(i) == str.charAt(i - 1) && str.charAt(i) == str.charAt(i - 2)) {
        continue;
      }
      result.append(str.charAt(i));
    }
    return result.toString();
  }
}
