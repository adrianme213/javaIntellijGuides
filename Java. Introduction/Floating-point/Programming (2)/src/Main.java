import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    double num = myScanner.nextDouble();
    double result = Math.floor((num - Math.floor(num)) * 10);
    System.out.println(result);

    myScanner.close();
  }
}