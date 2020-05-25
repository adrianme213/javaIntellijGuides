import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] matrix = new int[n][m];

    for(int i = 0;i < n;i++){
      for(int j = 0;j < m;j++){
        matrix[i][j] = scanner.nextInt();
      }
    }

    int kSeats = scanner.nextInt();
    int result = 0;
    int seatCount = 0;

    for(int ii = 0; ii < n; ii++) {
      for(int jj = 0; jj < m; jj++) {
        if(matrix[ii][jj] == 0) {
          seatCount++;
          if(seatCount == kSeats && result == 0) {
            result = ii + 1;
          }
        } else {
          seatCount = 0;
        }
      }
      seatCount = 0;
    }

    System.out.println(result);
    scanner.close();
  }
}
