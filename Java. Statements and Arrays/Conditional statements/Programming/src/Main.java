import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x = scanner.nextInt();
    String result;
    if(x > 0) {
      result = "YES";
    } else {
      result = "NO";
    }
    System.out.println(result);
    scanner.close();
  }
}