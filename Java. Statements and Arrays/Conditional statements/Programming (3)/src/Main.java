import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    String result = Integer.toString(a);
    String answer;
    while(result.length() < 4) {
      result = "0" + result;
    }

    if(result.charAt(0) == result.charAt(3) && result.charAt(1) == result.charAt(2)) {
      answer = "1";
    } else {
      answer = "45";
    }
    System.out.println(answer);
    scanner.close();
  }
}