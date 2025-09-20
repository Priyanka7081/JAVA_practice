import java.util.Scanner;

public class Boundary {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the no of rows");
            int n = sc.nextInt();
        System.err.println("Enter the no of cols");
            int m = sc.nextInt();
            for( int i =1; i <= n; i++){
                for(int j = 1; j <=m; j++){
                    if(i==1 || i==n || j==1 ||j==m)
                    System.err.print("* ");
                    else System.out.print("  ");
                }
                System.err.println("");
            }
        
    }
}
