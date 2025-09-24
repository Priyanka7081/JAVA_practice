
import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n..");
        int n = sc.nextInt();
        for( int i=1;i<=n;i++){  //lines or rows
            for(int j=1;j<=n-i;j++){  //this is for spaces
                System.out.print("  ");
            }
             for(int j=1;j<=2*i-1;j++){  // this is for stars
                System.out.print("* ");
                // System.out.print("j"); //for number
             }
             System.out.println();
        }
    }
}
