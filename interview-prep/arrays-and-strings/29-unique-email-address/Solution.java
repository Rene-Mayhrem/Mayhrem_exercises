import java.util.HashSet;
import java.util.Set;

public class Solution {
    //? INPUT -> String that contains en email address
    //? local@domain
    //? "." -> mail will be sent to the same address -> alice.m == alicem
    //? "+" -> everythin after this sign will be ignored -> alice+my == alice
    //? Possible to use both rules
    // [
    //     "test.email+alex@leetcode.com", == testemail@leetcode.com 
    //     "test.e.mail+bob.cathy@leetcode.com", == testemail@leetcode.com
    //     "testemail+david@lee.tcode.com" == testemail@lee.tcode.com
    // ]
    //? APPROACH
    //? Divide local and domain name by '@'
    //? Check if string contains "+" -> split by "+" and select just the first element
    //? Check if contains "." if contains just split en join the array
    //? Store the email address joining local@domain in a set
    //? Return the size of the set
    public int getNumUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            String[] target = email.split("@");
            target[0] = target[0].split("\\+")[0];
            target[0] = target[0].replaceAll("\\.", "");

            uniqueEmails.add(String.join("@", target));
            
        }
        return uniqueEmails.size();
    }
}
