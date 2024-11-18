public class Solution {
  public String gcdOfString (String str1, String str2) {
    //? input -> str1 and str2
    //? output -> str (greatest common divisor of both strings)
    /*
    * return the largest string x such that x divides both str1 and str2 ->
    * s = t + t + t .... + t
    * Basically str1 and str2 contains x
    */
    if (!(str1 + str2).equals(str2 + str1)) return "";
    int gcdLength = gcd(str1.length(), str2.length());
    return str1.substring(0, gcdLength);
  }

  private static int gcd (int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}
