import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Insert a number: ");
        int intNumber = scanner.nextInt();
        //System.out.println("Insert a double: ");
        double floatNumber = scanner.nextDouble();
        //System.out.println("Insert a string: ");
        scanner.nextLine();
        String varString = scanner.nextLine();
        scanner.nextLine();
        
        System.out.println("String: "+varString);
        System.out.println("Double: "+floatNumber);
        System.out.println("Int: "+intNumber);
    }
}
