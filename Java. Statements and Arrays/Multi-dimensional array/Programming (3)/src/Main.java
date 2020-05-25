import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] matrix = new int[n][n];

    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        matrix[row][col] = Math.abs(row-col);
        System.out.print(matrix[row][col] + " ");
      }
      System.out.println();
    }

    scanner.close();
  }
}