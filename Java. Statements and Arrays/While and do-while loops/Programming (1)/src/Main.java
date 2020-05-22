import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int tilEnd = scanner.nextInt();
    int maxNum = Integer.MIN_VALUE;
    int n;

    while(tilEnd > 0) {
      n = scanner.nextInt();
      if(n%4 == 0) {
        maxNum = Math.max(maxNum, n);
      }

      tilEnd--;
    }
    System.out.println(maxNum);
    scanner.close();
  }
}