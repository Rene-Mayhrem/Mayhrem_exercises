public class Solution {
  public boolean rotateString (String s, String goal) {
    //? input: strings 
    /* 
     * output: boolean if
     * if "s" after some shift of characters the same than goal
     */

     //! if s length different than goal length return false
     //! Create an new string doubledString -> s + s
     //! return string search method to find substring -> goal in doubledString

    if (s.length() != goal.length()) return false;
    String doubleString = s.concat(s);
    return doubleString.contains(goal);
  }
}
