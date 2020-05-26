import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int[][] a = new int[100][100];
    String s;
    String[] c;
    int m=0,n=0;
    while(scanner.hasNextInt()){
      s=scanner.nextLine();
      c=s.split(" ");
      m++; if(n==0) n=c.length;
      for(int i=1;i<=c.length;i++) a[m][i] = Integer.parseInt(c[i-1]);
    }
    for(int i=1;i<=m;i++) { a[i][0]=a[i][n]; a[i][n+1]=a[i][1];}
    for(int i=1;i<=n;i++) { a[0][i]=a[m][i]; a[m+1][i]=a[1][i]; }
    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++)
        System.out.print(a[i-1][j]+a[i+1][j]+a[i][j-1]+a[i][j+1]+" ");
      System.out.println();
    }
  }
}