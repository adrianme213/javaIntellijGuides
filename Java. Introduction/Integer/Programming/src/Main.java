import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int mult = ((num+1)*num+2)*num+3;
    System.out.println(mult);
    scanner.close();
  }
}