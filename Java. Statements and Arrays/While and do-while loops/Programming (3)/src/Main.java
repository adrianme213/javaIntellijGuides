import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numToSquare = 1;
    int maxNum = scanner.nextInt();

    while(numToSquare*numToSquare <= maxNum) {
      System.out.println(numToSquare*numToSquare);
      numToSquare++;
    }

    scanner.close();
  }
}