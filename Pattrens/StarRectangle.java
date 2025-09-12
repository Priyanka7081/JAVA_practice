
import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the no of rows");
            int n = sc.nextInt();
        System.err.println("Enter the no of cols");
            int m = sc.nextInt();
            for( int i =1; i <= n; i++){
                for(int j = 1; j <=m; j++){
                    System.err.print("* ");
                }
                System.err.println("");
            }
        
    }
}
