import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();


    for(int ii = a; ii <= b; ii++) {
      if (ii % 3 == 0 && ii % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (ii % 3 == 0) {
        System.out.println("Fizz");
      } else if (ii % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(ii);
      }
    }

    scanner.close();
  }
}