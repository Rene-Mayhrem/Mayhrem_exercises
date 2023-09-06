import java.util.ArrayList;
import java.util.List;

public class App {

    public static int getStatues (int[] statues) {
        List<Integer> statuesList = new ArrayList<Integer>();
        for(int statue: statues) {
            statuesList.add(statue);
        }
        int cont = 0;
        int minimum = getMinimum(statuesList);
        int maximum = getMaximum(statuesList);
        for(int i = minimum; i <= maximum; i++) {
            if(!statuesList.contains(i)) {
                cont++;
            }
        }
        return cont;
    }

    public static int getMinimum (List<Integer> statuesList) {
        int minimum = statuesList.get(0);
        for(int statue: statuesList) {
            if(statue < minimum) {
                minimum = statue;
            }
        }
        return minimum;
    }

    public static int getMaximum (List<Integer> statuesList) {
        int maximum = statuesList.get(0);
        for(int statue: statuesList) {
            if(statue > maximum) {
                maximum = statue;
            }
        }
        return maximum;
    }

    public static void main(String[] args) throws Exception {
        int[] statues = {6, 2, 3, 8};
        System.out.println(getStatues(statues));
    }
}
