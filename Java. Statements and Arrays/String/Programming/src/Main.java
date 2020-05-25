import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String numString = scanner.next();
    char[] numChars = numString.toCharArray();
    int[] nums = new int[numChars.length];
    for(int ii = 0; ii < numChars.length; ii++) {
      nums[ii] = Integer.valueOf(numChars[ii]);
    }

    if(nums[0]+nums[1]+nums[2] == nums[3]+nums[4]+nums[5]) {
      System.out.println("Lucky");
    } else {
      System.out.println("Regular");
    }

    scanner.close();
  }
}