import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    short num = scanner.nextShort();
    short result;
    if(num % 2 == 0) {
      result = (short) (num + 2);
    } else {
      result = (short) (num + 1);
    }
    System.out.println(result);
    scanner.close();
  }
}