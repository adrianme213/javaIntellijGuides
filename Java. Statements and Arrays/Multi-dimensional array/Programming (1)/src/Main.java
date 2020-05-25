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

    int maxNum = Integer.MIN_VALUE;
    String result = "-1 -1";
    for(int row = 0; row < n; row++) {
      for(int col = 0; col < m; col++) {
        if(matrix[row][col] > maxNum) {
          result = row + " " + col;
          maxNum = matrix[row][col];
        }
      }
    }
    System.out.println(result);
    scanner.close();
  }
}