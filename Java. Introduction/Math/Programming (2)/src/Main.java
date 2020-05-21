import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    double a = myScanner.nextDouble();
    double b = myScanner.nextDouble();
    double c = myScanner.nextDouble();
    double p = (a+b+c) / 2;
    double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    System.out.println(area);
  }
}