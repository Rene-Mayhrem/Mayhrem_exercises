import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(35);
        numbers.add(-15);
        numbers.add(7);
        numbers.add(55);
        numbers.add(1);
        numbers.add(-22);
        BubbleSort solution = new BubbleSort(numbers);
        solution.printingSortedArray();
    }
}

class BubbleSort {
    
    private List<Integer> numberList;

    public BubbleSort (List<Integer> numberList) {
        this.numberList = numberList;
    }

    private void swapElements (int currentIndex, int nextIndex) {
        if(currentIndex == nextIndex) {
            return;
        }
        int temporal = this.numberList.get(currentIndex);
        this.numberList.set(currentIndex, this.numberList.get(nextIndex));
        this.numberList.set(nextIndex, temporal);
    }

    private void sort () {
        for (int lastSortedIndex = this.numberList.size() - 1; lastSortedIndex >= 0; lastSortedIndex--) {
            for (int currentIndex = 0; currentIndex < lastSortedIndex; currentIndex++) {
                if (this.numberList.get(currentIndex) > this.numberList.get(currentIndex + 1)) {
                    swapElements(currentIndex, currentIndex + 1);
                }
            }
        }
    }

    public void printingSortedArray () {
        sort();
        for(Integer element : numberList) {
            System.out.println(element + " ");
        }
    }

}