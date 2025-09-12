package Loops;

import java.util.Scanner;

public class NonZeroPro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        while (n > 0) {
            int Lastdigit = n % 10;
            if (Lastdigit > 0) {
                product = Lastdigit * product;

            }

            n = n / 10;
        }
        System.out.println(product);
    }
}
