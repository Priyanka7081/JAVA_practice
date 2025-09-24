

import java.util.Scanner;

public class Pattren8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for(int i=1; i<=n; i++){  //rows
            for(int j=1;j<=n-i;j++){ //Spaces
                System.out.print(" "+" ");
            }
            for(int j=1; j<=i;j++){  //Stars
                System.out.print((char)(j+64)+" "); // uppercase
                System.out.print((char)(j+96)+" ");  //lowercase
            }
            System.out.println();
         }

    }
    
}
