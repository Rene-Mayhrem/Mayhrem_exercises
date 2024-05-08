public class App {

    public static int matrixElementSum (int[][] matrix ) {
        // * Declaring the sum as zero (initially)
        int total = 0;
        // ? iterate the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // ? Checking if it is the first array
                if (i == 0) {
                    // ! Checking if the element is different than zero
                    if (matrix[i][j] > 0) {
                        total += matrix[i][j];
                    }
                }else {
                    // ! Checking if the element is different than zero
                    if (matrix[i][j] > 0) {
                        int aux = 0;
                        // ! Checking if the element above is not zero 
                        for (int k = 0; k < i - 1; k++) {
                            if (matrix[k][j] == 0) {
                                aux = 1;
                                break;
                            }
                        }
                        if (aux == 0) {
                            total += matrix[i][j];
                        }
                    }
                }
            }
        }
        return total;
    }

    public static void main(String[] args) throws Exception {
        // ? Adding the initial configuration to my solution
        int[][] matrix = {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}};

        System.out.println(matrixElementSum(matrix));
    }
}
