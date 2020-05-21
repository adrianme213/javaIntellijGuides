import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    byte class1 = scanner.nextByte();
    byte class2 = scanner.nextByte();
    byte class3 = scanner.nextByte();
    byte result = (byte) ((class1/2 + class1%2)+(class2/2 + class2%2)+(class3/2 + class3%2));
    System.out.println(result);
    scanner.close();
  }
}