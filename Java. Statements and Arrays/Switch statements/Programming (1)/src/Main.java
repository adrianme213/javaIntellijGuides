import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    String result = "move ";

    switch(n) {
      case 1:
        result += "up";
        break;
      case 2:
        result += "down";
        break;
      case 3:
        result += "left";
        break;
      case 4:
        result += "right";
        break;
      case 0:
        result = "do not move";
        break;
      default:
        result = "error!";
    }

    System.out.println(result);
    scanner.close();
  }
}