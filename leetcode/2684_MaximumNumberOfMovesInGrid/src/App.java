public class App {
    public static void main(String[] args) throws Exception {
        int[][] grid = {{2, 4, 3, 5},{5, 4, 9, 3},{3, 4, 2, 11}, {10, 9, 13, 15}};
        Solution solution = new Solution();
        solution.maxMoves(grid);
    }
}
