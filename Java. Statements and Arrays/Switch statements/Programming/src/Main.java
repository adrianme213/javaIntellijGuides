import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    String result = "You have chosen a ";

    switch(n) {
      case 1:
        result += "square";
        break;
      case 2:
        result += "circle";
        break;
      case 3:
        result += "triangle";
        break;
      case 4:
        result += "rhombus";
        break;
      default:
        result = "There is no such shape!";
    }

    System.out.println(result);
    scanner.close();
  }
}