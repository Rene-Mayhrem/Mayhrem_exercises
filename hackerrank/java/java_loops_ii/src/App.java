import java.util.Scanner;

public class App {

  //We use the integers a, b, and n to create the following series:

  // You are given  queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of space-separated integers.

  // Input Format

  // The first line contains an integer ,q, denoting the number of queries.
  // Each line  of the  subsequent lines contains three space-separated integers describing the respective a, b, and n values for that query.

  //? Process
  //   1. Get initial values a, b, and n
  //   2. Create a variable where the total sum is going to be stored
  //   3. Create a function that iterates and return the following sum: (2**i * b)
  //   4. Add a + function of instruction 3




  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    // ? variable for query -> number of queries iterations
    int q = sc.nextInt();
    int a = sc.nextInt(); //? variable for calculation -> a
    int b = sc.nextInt(); //? variable for calculation -> b
    int n = sc.nextInt(); //? variable for calculation -> n (iteration)

    for (int i = 0; i < q; i++) {
      int remain = 0;
      for (int j = 0; j < n; j++) {
        remain += remain + (a + Math.pow(2, j) * b);
        System.out.print(remain+" ");
      }
      System.out.println();
    }

  }
}
