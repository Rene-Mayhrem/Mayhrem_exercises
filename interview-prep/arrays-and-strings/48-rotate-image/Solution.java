

public class Solution {
    //? INPUT
    //? -> void image variable has to be updated
    //? 1st APPROACH
    //? Convert rows into colums
    //? Revert columns order
    public void rotate(int[][] image) {
        int n = image.length;

        //? Convert rows into columns
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }
        }

        //? Reverse 
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while(left < right) {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}



