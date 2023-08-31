import java.util.ArrayList;
import java.util.List;

public class App {

    public static List<Character> getWordList (String word) {
        char[] wordArray = word.toCharArray();
        List<Character> wordList = new ArrayList<>();
        for(char element : wordArray) {
            wordList.add(element);
        }
        return wordList;
    }

    public static char getFirstDuplicateChar (String word) {
        //? Create List character
        List<Character> wordList = getWordList(word);
        //? Iterate through the List
        for(Character element : wordList) {
            //? check if the element is a non-repeated value
            if(wordList.indexOf(element) == wordList.lastIndexOf(element)) {
                return element;
            }
        }
        return '_';
    }
    public static void main(String[] args) throws Exception {
        System.out.println(getFirstDuplicateChar("abacabad"));
    }
}
