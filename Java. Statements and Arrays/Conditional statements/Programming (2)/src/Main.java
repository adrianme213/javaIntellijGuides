import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    String result;
    if((a > -15 && a <= 12) || (a > 14 && a < 17) || (a >= 19)) {
      result = "True";
    } else {
      result = "False";
    }
    System.out.println(result);
    scanner.close();
  }
}