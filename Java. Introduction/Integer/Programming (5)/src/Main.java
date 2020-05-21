import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int hundo = n/100;
    int tenso = (n%100)/10;
    int oneso = (n%10);
    int result = hundo+tenso+oneso;
    System.out.println(result);
    scanner.close();
  }
}