import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    double a = myScanner.nextDouble();
    double b = myScanner.nextDouble();
    double result = Math.pow(a, b);
    System.out.println(result);

    myScanner.close();
  }
}