import java.util.ArrayList;
import java.util.List;

public class App {


    int findLargestLength (String[] strings) {
        int aux = strings[0].length();
        for (String element : strings) {
            if (element.length() > aux) {
                aux = element.length();
            }
        }
        return aux;
    }

    String[] findStringsInArray (String[] inputArray) {
        List<String> largestStrings = new ArrayList<>();
        for (String element : inputArray) {
            if (findLargestLength(inputArray) == element.length()) {
                largestStrings.add(element);
            }
        }
        return largestStrings.toArray(new String[0]);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
