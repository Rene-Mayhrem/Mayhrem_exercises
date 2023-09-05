public class App {

    public static int getShapeArea (int n) {
        //? Create auxiliar variable
        int polygonArea = 1;
        //? Iterate until the n to generate polygon interesting areas
        for (int i = 1; i < n; i++) {
            polygonArea += i*4;
        }
        return polygonArea;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getShapeArea(4));
    }
}
