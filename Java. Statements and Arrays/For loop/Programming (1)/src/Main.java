import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numOfInputs = scanner.nextInt();
    int sum = 0;
    int num;
    for(int ii = 0; ii < numOfInputs; ii++) {
      num = scanner.nextInt();
      if(num%6 == 0) {
        sum += num;
      }
    }

    System.out.println(sum);
    scanner.close();
  }
}