import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    double a = myScanner.nextDouble();
    double b = myScanner.nextDouble();
    double c = myScanner.nextDouble();
    double sqrtVal = Math.sqrt(b*b - 4*a*c);
    double val1 = (-b - sqrtVal) / (2*a);
    double val2 = (-b + sqrtVal) / (2*a);
    System.out.println(Math.min(val1, val2) + " " + Math.max(val1, val2));
  }
}