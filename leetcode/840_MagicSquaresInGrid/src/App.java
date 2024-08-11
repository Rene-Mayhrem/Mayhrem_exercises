public class App {

    public static int sumOfSquare (int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfSquare(n - 1);
        }
    }

    public boolean checkSquare (int[][] square) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (square[i][j] <= 0 && square[i][j] >= 10) {
                    return false;
                }
            }
        }
        return false;
    }



    public static int getSumOfSquare (int[][] square ) {
    
        return 0;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(sumOfSquare(9));
    }


}
