import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numStudents = scanner.nextInt();
    int aCount = 0;
    int bCount = 0;
    int cCount = 0;
    int dCount = 0;
    int num;


    for(int ii = 0; ii < numStudents; ii++) {
      num = scanner.nextInt();
      if(num == 2) {
        dCount++;
      } else if(num == 3) {
        cCount++;
      } else if(num == 4) {
        bCount++;
      } else if(num == 5) {
        aCount++;
      }
    }

    System.out.println(dCount + " " + cCount + " " + bCount + " " + aCount);
    scanner.close();
  }
}