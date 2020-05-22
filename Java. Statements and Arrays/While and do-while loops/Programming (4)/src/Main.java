import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long myLong = scanner.nextLong();
    long num = 1;
    long fact = 1;


    while(fact <= myLong) {
      num++;
      fact *= num;
    }
    System.out.println(num);
    scanner.close();
  }
}