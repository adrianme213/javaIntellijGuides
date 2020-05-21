import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();
    String result;

    boolean c1 = x1 == x2;
    boolean c2 = y1 == y2;
    boolean c3 = Math.abs(y2-y1) == Math.abs(x2-x1);

    if(c1 || c2 || c3) {
      result = "YES";
    } else {
      result = "NO";
    }
    System.out.println(result);
    scanner.close();
  }
}