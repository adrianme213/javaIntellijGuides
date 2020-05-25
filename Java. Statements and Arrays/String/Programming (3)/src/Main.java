import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] word = scanner.next().toLowerCase().toCharArray();

    double count = 0;
    for(int ii = 0; ii < word.length; ii++) {
      char curLetter = word[ii];
      if(curLetter == 'c' || curLetter == 'g') {
        count++;
      }
    }
    double perc = count/(word.length)*100d;
    System.out.println(perc);
    scanner.close();
  }
}