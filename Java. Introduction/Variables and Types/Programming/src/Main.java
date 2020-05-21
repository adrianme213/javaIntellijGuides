import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
    String[] values = myReader.readLine().split("\\s+");
    int a = Integer.parseInt(values[0]);
    int b = Integer.parseInt(values[1]);
    System.out.println(b + " " + a);
  }
}