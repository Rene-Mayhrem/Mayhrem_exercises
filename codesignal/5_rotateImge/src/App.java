public class App {

    public static int[][] rotateImage (int[][] image) {
        //? image length
        int n = image.length;
        //? create new image
        int[][] imageRotated = new int[n][n];
        System.out.println(n);
        //? auxiliar variable
        int row = 0; 
        for(int i = 0; i < n; i++) {
            int column = n - 1;
            for(int j = 0; j < n; j++) {
                System.out.println("Position: "+column+" i and "+row+" j");
                imageRotated[i][j] = image[column][row];
                column--;
            }
            System.out.println();
            row++;
        }
        return imageRotated;
    }

    public static void main(String[] args) throws Exception {
        int[][] image = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] newImage = rotateImage(image);
        System.out.println("...............................");
        for(int i = 0; i < newImage.length; i++) {
            for(int j = 0; j < newImage.length; j++) {
                System.out.print(newImage[i][j]+" ");
            }
            System.out.println();
        }
    }
}
