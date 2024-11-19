import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List clouds = Arrays.asList(0, 0, 1, 0, 0, 1, 0);
        System.out.println(new Solution().jumpingOnClouds(clouds));
    }
}
