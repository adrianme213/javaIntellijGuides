import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int sum = 0;

    for(int ii = a; ii <= b; ii++) {
      sum += ii;
    }

    System.out.println(sum);
    scanner.close();
  }
}