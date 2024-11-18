import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        sol.finalPositionOfSnake(0, null);
    }
}

class Solution {
    public int finalPositionOfSnake (int n, List<String> moves) {
        int[][] field = createMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(field[i][j]);
            }
        }
        return 0;
    }

    public int[][] createMatrix (int n) {
        int[][] field = new int[n][n];
        int aux = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                field[i][j] = ++aux;
            }
        }
        return field;
    }

}