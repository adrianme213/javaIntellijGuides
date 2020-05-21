import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    float distanceBetweenCities = myScanner.nextFloat();
    float travelTimeByBus = myScanner.nextFloat();
    float result = distanceBetweenCities / travelTimeByBus;
    System.out.println(result);
    myScanner.close();
  }
}