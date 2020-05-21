import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    String result = "legion";

    if(n < 1) {
      result = "no army";
    } else if (n >= 1 && n <= 4) {
      result = "few";
    } else if (n >= 5 && n <= 9) {
      result = "several";
    } else if (n >= 10 && n <= 19) {
      result = "pack";
    } else if (n >= 20 && n <= 49) {
      result = "lots";
    } else if (n >= 50 && n <= 99) {
      result = "horde";
    } else if (n >= 100 && n <= 249) {
      result = "throng";
    } else if (n >= 250 && n <= 499) {
      result = "swarm";
    } else if (n >= 500 && n <= 999) {
      result = "zounds";
    }

    System.out.println(result);
    scanner.close();
  }
}