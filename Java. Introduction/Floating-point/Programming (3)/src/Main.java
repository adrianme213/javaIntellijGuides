import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    double x = myScanner.nextDouble();
    double result = Math.pow(x, 3) + Math.pow(x, 2) + x + 1;
    System.out.println(result);

    myScanner.close();
  }
}