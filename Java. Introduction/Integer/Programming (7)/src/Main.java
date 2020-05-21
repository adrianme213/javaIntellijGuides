import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int firstHours = scanner.nextInt();
    int firstMins = scanner.nextInt();
    int firstSecs = scanner.nextInt();
    int secondHours = scanner.nextInt();
    int secondMins = scanner.nextInt();
    int secondSecs = scanner.nextInt();
    int hoursToSecs = (secondHours-firstHours)*3600;
    int minsToSecs = (secondMins-firstMins)*60;
    int secs = (secondSecs-firstSecs);
    int result = hoursToSecs + minsToSecs + secs;
    System.out.println(result);
    scanner.close();
  }
}