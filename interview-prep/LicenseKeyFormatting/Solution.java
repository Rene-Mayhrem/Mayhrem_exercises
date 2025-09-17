package LicenseKeyFormatting;

public class Solution {
    public String  licenseKeyFormatting (String s, int k) {
        s = s.replaceAll("\\-", "").toUpperCase();
        StringBuilder result = new StringBuilder();
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (counter == k) {
                result.append("-");
                counter = 0;
            }
            result.append(s.charAt(i));
            counter++;
        }
        return result.reverse().toString();
    }
}
