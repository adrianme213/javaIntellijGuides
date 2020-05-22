import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int len = scanner.nextInt();
    int res;
    if(len == 1) {
      res = scanner.nextInt();
    } else {

      int[] arr = new int[len];
      for(int ii = 0; ii < len; ii++) {
        arr[ii] = scanner.nextInt();
      }
      Arrays.sort(arr);
      res = arr[arr.length-1]*arr[arr.length-2];

    }

    System.out.println(res);
    scanner.close();
  }
}