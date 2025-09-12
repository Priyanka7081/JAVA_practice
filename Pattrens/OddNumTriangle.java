
import java.util.Scanner;

public class OddNumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //for Odd number pattren 
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print((2*j-1) +" ");
            }
            System.out.println();
        }
    }
}
