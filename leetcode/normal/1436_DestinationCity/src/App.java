import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("london", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));

        Solution solution = new Solution();
        // solution.destCity(paths)
        System.out.println(solution.destinyCity(paths));

        List<List<String>> paths2 = new ArrayList<>();
        paths2.add(Arrays.asList("pYyNGfBYbm", "wxAscRuzOl"));
        paths2.add(Arrays.asList("kzwEQHfwce", "pYyNGfBYbm"));
        System.out.println(solution.destinyCity(paths2));

    }
}

