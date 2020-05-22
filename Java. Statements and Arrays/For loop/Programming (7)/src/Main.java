import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numOfParts = scanner.nextInt();
    int lCount = 0;
    int sCount = 0;
    int pCount = 0;
    int val;

    for(int ii = 0; ii < numOfParts; ii++) {
      val = scanner.nextInt();
      if (val == 0) {
        pCount++;
      } else if (val == -1) {
        sCount++;
      } else {
        lCount++;
      }
    }

    System.out.println(pCount+" "+lCount+" "+sCount);
    scanner.close();
  }
}