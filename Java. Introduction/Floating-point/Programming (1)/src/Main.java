import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    double num = myScanner.nextFloat();
    double result = num - Math.floor(num);
    System.out.println(result);

    myScanner.close();
  }
}