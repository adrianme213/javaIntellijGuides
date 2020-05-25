import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] matrix = new int[n][m];

    for (int row = 0; row < n; row++) {
      for (int col = 0; col < m; col++) {
        matrix[row][col] = scanner.nextInt();
      }
    }


    int a = scanner.nextInt();
    int b = scanner.nextInt();

    for(int row = 0; row < n; row++) {
      int temp = matrix[row][b];
      matrix[row][b] = matrix[row][a];
      matrix[row][a] = temp;
    }



    for (int row = 0; row < n; row++) {
      for (int col = 0; col < m; col++) {
        System.out.print(matrix[row][col] + " ");
      }
      System.out.println();
    }

    scanner.close();
  }
}