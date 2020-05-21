import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int year = scanner.nextInt();
    String result;

    if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
      result = "Leap";
    } else {
      result = "Regular";
    }
    System.out.println(result);
    scanner.close();
  }
}