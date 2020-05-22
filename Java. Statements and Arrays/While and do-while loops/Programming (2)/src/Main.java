import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int sum = 0;
      int n = Integer.MIN_VALUE;
      while(n != 0) {
        n = scanner.nextInt();
        sum += n;
      }

      System.out.println(sum);
      scanner.close();
  }
}