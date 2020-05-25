import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] word = scanner.next().toCharArray();

    int ii = 0;
    int pp = word.length-1;
    String result = "yes";
    while(ii < pp) {
      if(word[ii] != word[pp]) {
        result = "no";
        break;
      }
      ii++;
      pp--;
    }
    System.out.println(result);
    scanner.close();
  }
}