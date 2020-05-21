import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    int x1 = myScanner.nextInt();
    int result = ((x1 % 100)/10) ^ ((x1%100)%10);
    System.out.println(result);
    myScanner.close();
  }
}