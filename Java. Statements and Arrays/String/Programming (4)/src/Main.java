import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    char el = line.charAt(0);
    int count = 0;
    for (int i = 0; i < line.length(); i++) {
      if (line.charAt(i) == el) {
        count++;
      } else {
        System.out.print(el);
        System.out.print(count);
        el = line.charAt(i);
        count = 1;
      }
    }
    System.out.print(el);
    System.out.print(count);
  }
}
