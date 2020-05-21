import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String result = String.valueOf(n);
    System.out.println(result.charAt(0));
    scanner.close();
  }
}