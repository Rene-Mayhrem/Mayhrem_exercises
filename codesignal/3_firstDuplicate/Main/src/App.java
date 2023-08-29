import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static Map<Integer, List<Integer>> getFrequencyMap (int[] numbers) {
        Map<Integer, List<Integer>> frequencyMap = new HashMap<>();
        //? find for repeated values
        for(int i = 0; i < numbers.length; i++) {
            //? search if the valuehas been previously added to the map
            if(!frequencyMap.containsKey(numbers[i])) { //? the value hasn't been added
                frequencyMap.put(numbers[i], new ArrayList<>()); //? initiate an empty array list on the value created
            }
            frequencyMap.get(numbers[i]).add(i); //? Add index position for the numbers[i]
        }
        return frequencyMap;
    }

    public static int getFirstDuplicate (int[] numbers) {
        Map<Integer, List<Integer>> frequencyMap = getFrequencyMap(numbers);
        List<Map.Entry<Integer, List<Integer>>> frequencyMapEntry = new ArrayList<>(frequencyMap.entrySet());
        int firstValue = numbers.length; //? first duplicate value at maximum
        int aux = -1; //? map key value
        for(Map.Entry<Integer, List<Integer>> entry: frequencyMapEntry) {
            //? check if there are more than one value
            if(entry.getValue().size() > 1) { //? check for duplicated values
                if(entry.getValue().get(1) <= firstValue) { //? if the value is lower than the length
                    firstValue = entry.getValue().get(1);  //? Assign index
                    aux = entry.getKey(); //? assign key value
                }
            }
        }
        return aux;
    } 

    public static void main(String[] args) throws Exception {
        int[] numbers = {1, 2, 4, 5, 6, 1, 3, 6, 6, 7, 3, 2, 5};
        System.out.println(getFirstDuplicate(numbers));
    }


}
