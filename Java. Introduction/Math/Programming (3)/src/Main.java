import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    double x1 = myScanner.nextDouble();
    double y1 = myScanner.nextDouble();
    double x2 = myScanner.nextDouble();
    double y2 = myScanner.nextDouble();
    double angle1 = Math.toDegrees(Math.atan(y1/x1));
    double angle2 = Math.toDegrees(Math.atan(y2/x2));
    double result = Math.max(angle1, angle2) - Math.min(angle1, angle2);
    System.out.println(result);
    myScanner.close();
  }
}