import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] myStrings = scanner.nextLine().split(" ");
    int maxLen = Integer.MIN_VALUE;
    String result = "";
    for(int ii = 0; ii < myStrings.length; ii++) {
      if(myStrings[ii].length() > maxLen) {
        maxLen = myStrings[ii].length();
        result = myStrings[ii];
      }
    }

    System.out.println(result);
    scanner.close();
  }
}