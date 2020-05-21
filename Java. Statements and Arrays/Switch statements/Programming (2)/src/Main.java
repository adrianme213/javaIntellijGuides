import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long n1 = scanner.nextLong();
    char symbol = scanner.next().charAt(0);
    long n2 = scanner.nextLong();

    String result;
    switch(Character.toString(symbol)) {
      case "+":
        result = Long.toString(n1 + n2);
        break;
      case "-":
        result = Long.toString(n1 - n2);
        break;
      case "*":
        result = Long.toString(n1 * n2);
        break;
      case "/":
        if(n2 == 0) {
          result = "Division by 0!";
        } else {
          result = Long.toString(n1 / n2);
        }
        break;
      default:
        result = "Unknown operator";
    }

    System.out.println(result);
    scanner.close();
  }
}