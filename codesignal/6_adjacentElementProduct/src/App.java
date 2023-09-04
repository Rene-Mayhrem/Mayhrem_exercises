public class App {
    public static int getLargestProduct (int[] inputArray) {
        //? auxiliar variable
        int largestProduct = inputArray[0] * inputArray[1]; //? Assign first adjacent product
        //? First loop for inputArray[i]
        for(int i = 0; i < inputArray.length - 1; i++) {
            //? product var
            int product = inputArray[i] * inputArray[i+1];
            //? conditional
            if(product >= largestProduct) {
                largestProduct = product; //? finding the largestProduct
            }
        }
        return largestProduct;
    }

    public static void main(String[] args) throws Exception {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println(getLargestProduct(inputArray));
    }
}
