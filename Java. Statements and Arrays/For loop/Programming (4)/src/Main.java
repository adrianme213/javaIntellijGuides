import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int sum = 0;
    double count = 0;

    for(int ii = a; ii <= b; ii++) {
      if(ii%3 == 0) {
        count++;
        sum += ii;
      }
    }

    double result = sum/count;
    System.out.println(result);
    scanner.close();
  }
}