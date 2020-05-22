import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int len = scanner.nextInt();
    int[] arr = new int[len];
    for(int ii = 0; ii < len; ii++) {
      arr[ii] = scanner.nextInt();
    }
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    boolean res = false;
    for(int ii = 1; ii < len; ii++) {
      if(arr[ii-1] == n && arr[ii] == m) {
        res = true;
        break;
      } else if (arr[ii-1] == m && arr[ii] == n) {
        res = true;
        break;
      }
    }

    System.out.println(res);
    scanner.close();
  }
}