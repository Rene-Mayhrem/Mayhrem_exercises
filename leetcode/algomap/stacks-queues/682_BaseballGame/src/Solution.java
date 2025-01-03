import java.util.Stack;

public class Solution {
  // ? INPUT -> possible values
  // ? integers (negative and positive)
  // ? Following letters and symbol -> C, D or +
  // ? OUTPUT
  // ? The sum of the record score based in the rules described previously
  // ? SOLUTION
  // * Create a stack to store records (integers)
  // * Iterate the string array
  // * Check if the current string can be parsed into an integer
  // * String can be converted into an integer -> Add the value to the stack
  // * The string is one of the other elements
  // * Use a switch to divide the different operations
  // * case "+" -> Create an auxiliar variable called sum = 0
  // * Use a for condition while stack is not emtpy and i is less than 2
  // * Sum the 2 previous elements
  // * Add the sum variable to the stack
  // * case "D" -> create a variable to store top value
  // * Add top value and doubleTop value
  // * case "C" -> pop last element
  // * After iterating the string array, we create a sum auxiliar var = 0
  // * Iterate the stack while is not empty and summ the values
  public int calPoints(String[] operations) {
    Stack<Integer> records = new Stack<>();
    int top = 0;
    for (String operation : operations) {
      switch (operation) {
        case "+":
          top = records.pop();
          int newTop = records.peek();
          records.push(top);
          records.push(top + newTop);
          break;
        case "D":
          top = records.pop();
          records.push(top);
          records.push(2 * top);
          break;
        case "C":
          records.pop();
          break;
        default:
          records.add(Integer.valueOf(operation));
          break;
      }
    }
    int sum = 0;
    while (!records.isEmpty()) sum += records.pop();
    return sum;
  }
}
