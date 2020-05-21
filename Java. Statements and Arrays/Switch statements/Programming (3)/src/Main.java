import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String shape = scanner.next();

    String result = "";
    switch(shape) {
      case "triangle":
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = (a+b+c) / 2.;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        result = Double.toString(area);
        break;
      case "rectangle":
        double l = scanner.nextDouble();
        double w = scanner.nextDouble();
        result = Double.toString(l*w);
        break;
      case "circle":
        double r = scanner.nextDouble();
        double sol = 3.14 * r * r;
        result = Double.toString(sol);
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + shape);
    }

    System.out.println(result);
    scanner.close();
  }
}