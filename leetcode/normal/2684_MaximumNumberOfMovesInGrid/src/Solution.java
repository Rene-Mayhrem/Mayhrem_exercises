import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {
  public int maxMoves(int[][] grid) {
    Set<Location> moves = new HashSet<>();
    int row = 0, col = 0;
    while (row < grid[0].length) {
      Stack<Location> possibleMoves = new Stack<>();
      int n = 2;
      for (int i = -1; i < n; i++) {
        int newRow = row + i, newCol = col + 1;
        if (newRow >= 0 && newCol < grid.length) {
          possibleMoves.add(new Location(newRow, newCol));
          System.out.println(possibleMoves.getLast().row + " " + possibleMoves.getLast().col);
        }
      }
      int targetRow = possibleMoves.getLast().row;
      int targetCol = possibleMoves.getLast().col;
      System.out.println(grid[targetRow][targetCol]+" x "+grid[row][col]);
      if (grid[targetRow][targetCol] > grid[row][col]) {
        moves.add(new Location(targetRow, targetCol));
        row = targetRow;
        col = targetCol;
      }
      row++;
      col++;
      System.out.println(possibleMoves);
    }
    return moves.size();
  }
}

class Location {
  public int row;
  public int col;

  public Location(int row, int col) {
    this.row = row;
    this.col = col;
  }
}