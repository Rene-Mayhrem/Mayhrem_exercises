import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        List<Integer> buildingCount = Arrays.asList(1, 2, 1, 2, 2);
        List<Integer> routerLocation = Arrays.asList(3, 1);
        List<Integer> routerRange = Arrays.asList(1, 2);
        System.out.println(new Solution().getServedBuildings(buildingCount, routerLocation, routerRange));
    }
}
