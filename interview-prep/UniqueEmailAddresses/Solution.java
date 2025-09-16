package UniqueEmailAddresses;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails (String[] emails) {
        Set<String> emailsSet = new HashSet<>();
        for (String email : emails){
            String[] localGlobal = email.split("@");
            emailsSet.add(normalizeEmail(localGlobal[0]).concat("@").concat(localGlobal[1]));
        }
        return emailsSet.size();
    }

    public String normalizeEmail (String email) {
        return email.split("\\+")[0].replaceAll("\\.", "");
    } 
}
