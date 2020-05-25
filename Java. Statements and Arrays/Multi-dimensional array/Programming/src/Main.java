import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] matrix = new int[n][n];
    // Fill the matrix
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        matrix[row][col] = scanner.nextInt();
      }
    }

    String result = "YES";
    for(int row = 0; row < matrix.length; row++) {
      for(int col = 0; col < matrix[row].length; col++) {
        if(row == col) {
          continue;
        } else if (matrix[row][col] != matrix[col][row]) {
          result = "NO";
          break;
        }

      }
    }
    System.out.println(result);
    scanner.close();
  }
}