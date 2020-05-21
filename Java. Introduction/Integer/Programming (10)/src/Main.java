import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    byte h = scanner.nextByte();
    byte up = scanner.nextByte();
    byte down = scanner.nextByte();

    byte result = (byte) (((h-up)/(up-down)) + ((up-down)-1+(h-up)%(up-down))/(up-down)+1);
    System.out.println(result);
    scanner.close();
  }
}