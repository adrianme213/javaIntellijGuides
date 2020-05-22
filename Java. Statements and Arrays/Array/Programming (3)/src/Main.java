import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int len = scanner.nextInt();
    int[] arr = new int[len];
    for(int ii = 1; ii < len; ii++) {
      arr[ii] = scanner.nextInt();
    }
    arr[0] = scanner.nextInt();
    for(int ii = 0; ii < len; ii++) {
      System.out.print(arr[ii] + " ");
    }

    scanner.close();
  }
}