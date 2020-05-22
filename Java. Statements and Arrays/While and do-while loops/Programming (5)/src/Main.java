import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    int curNum = 0;
    String result = "";

    while(num > 0) {
      curNum += 1;
      int dummyNum = curNum;
      while(num > 0 && dummyNum > 0) {
        result += curNum + " ";
        dummyNum--;
        num--;
      }
    }

    System.out.println(result);
    scanner.close();
  }
}