import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int len = scanner.nextInt();
    int[] arr = new int[len];
    for(int ii = 0; ii < len; ii++) {
      arr[ii] = scanner.nextInt();
    }

    int maxNum = Integer.MIN_VALUE;
    int maxIdx = 0;
    for(int ii = 0; ii < arr.length; ii++) {
      if(arr[ii] > maxNum) {
        maxNum = arr[ii];
        maxIdx = ii;
      }
    }

    System.out.println(maxIdx);
    scanner.close();
  }
}