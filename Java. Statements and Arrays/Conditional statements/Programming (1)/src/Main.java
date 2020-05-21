import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    String result;
    if(c >= a+b || a >= b+c || b >= a+c) {
      result = "NO";
    } else {
      result = "YES";
    }
    System.out.println(result);
    scanner.close();
  }
}