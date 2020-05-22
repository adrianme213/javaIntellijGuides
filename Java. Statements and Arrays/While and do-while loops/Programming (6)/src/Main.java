import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    String result = Integer.toString(n);

    while(n != 1) {
      if(n%2 == 0) {
        n = n/2;
      } else {
        n = 3*n + 1;
      }
      result += (" " + n);
    }

    System.out.println(result);
    scanner.close();
  }
}