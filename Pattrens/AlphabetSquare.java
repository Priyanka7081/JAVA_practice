import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){  //Rows
            for( int j=1; j<=n; j++){   //Cols

                //For UpperCase
                System.out.print((char)(j + 64) + " "); // yha pr typecasting kiya gya h for the alphabet

                //for LowwerCase
                System.out.print((char)(j + 96) + " ");
            }
            System.out.println();
        }
    
    }
}
