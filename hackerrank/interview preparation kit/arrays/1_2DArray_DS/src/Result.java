import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Proxy {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    class SubsetHourglass {
        int i;
        int j;
        
        SubsetHourglass (int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
    
    private Stack<SubsetHourglass> getSubsets (int n) {
        Stack<SubsetHourglass> subsets = new Stack<>();
        for (int i = 0; (i + 2) < n; i++) {
            for (int j = 0; (j + 2) < n; j++) {
                subsets.add(new SubsetHourglass(i, j));
            }
        }
        return subsets;
    }
    
    
    
    public int hourglassSum(List<List<Integer>> arr) {
        int max = 0;
        Stack<SubsetHourglass> subsets = getSubsets(arr.size());
        while(!subsets.isEmpty()) {
            SubsetHourglass subset = subsets.pop();
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; i < 3; j++) {
                    if (i == 1 && (j == 0 || j == 2)) {
                        continue;
                    } else {
                        sum += arr.get(i + subset.i).get(j + subset.j);
                    }
                }
            }
            max = Math.max(max, sum);
        }
        return max;
        

    }

}

public class Result {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = new Proxy().hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}