package Loops;

import java.util.Scanner;

public class ProductOfdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        while(n >1){
            int Lastdigit = n%10;
            product = Lastdigit * product;
            n = n/10;
        }
        System.out.println(product);
    }
    
}
