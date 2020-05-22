import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numOfInputs = scanner.nextInt();
    int maxNum = Integer.MIN_VALUE;
    int num;
    for(int ii = 0; ii < numOfInputs; ii++) {
      num = scanner.nextInt();
      if(num%4 == 0) {
        maxNum = Math.max(maxNum, num);
      }
    }

    System.out.println(maxNum);
    scanner.close();
  }
}