import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();

    for(int ii = 0; ii <= 1000; ii++) {
      if(a*Math.pow(ii,3)+b*Math.pow(ii,2)+c*ii+d == 0) {
        System.out.println(ii);
      }
    }

    scanner.close();
  }
}