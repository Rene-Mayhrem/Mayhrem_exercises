
public class Main {
    

    public boolean containsDuplicate (String word) {
        String formatedString = word.toLowerCase().trim();
        if (formatedString.length() > 26) return true; 
        boolean[] alphabet = {
        false, false, false... false
        };
        for (int currentChar : formatedString.toCharArray()) {
            int alphabetIndex = currentChar - 97; // since 'a' value is 97 in ascii
            if (alphabet[alphabetIndex]) return true;
            alphabet[alphabetIndex] = true;
        }
        return false;
    }    
}
