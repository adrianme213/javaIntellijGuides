import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int h = scanner.nextInt();
    String result = "";

    boolean c1 = (h >= a) && (h <= b);
    boolean c2 = h < a;
    boolean c3 = h > b;

    if(c1) {
      result = "Normal";
    } else if(c2) {
      result = "Deficiency";
    } else if(c3) {
      result = "Excess";
    }

    System.out.println(result);
    scanner.close();
  }
}