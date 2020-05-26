import java.util.Scanner;

public class Main {
  static int val = 1;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int[][] array = new int[n][n];
    int row = n;
    int col = n;

    int initRow = 0;
    int initCol = 0;

    while (val < n * n + 1) {
      leftToRightFill(array, initRow, initCol, col);
      initRow++;
      topToDownFill(array, initRow, row, col);
      col--;
      rightToLeftFill(array, row - 1, initCol, col);
      row--;
      downToTopFill(array, initRow, row, initCol);
      initCol++;
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static void leftToRightFill(int[][] array, int row, int initCol, int col) {
    for (int j = initCol; j < col; j++)
      array[row][j] = val++;
  }

  private static void topToDownFill(int[][] array, int initRow, int row, int col) {
    for (int i = initRow; i < row; i++)
      array[i][col - 1] = val++;
  }

  private static void rightToLeftFill(int[][] array, int row, int initCol, int col) {
    for (int j = col - 1; j >= initCol; j--)
      array[row][j] = val++;
  }

  private static void downToTopFill(int[][] array, int initRow, int row, int col) {
    for (int j = row - 1; j >= initRow; j--)
      array[j][col] = val++;
  }
}
