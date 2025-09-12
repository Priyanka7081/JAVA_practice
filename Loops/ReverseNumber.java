package Loops;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) { // jabtk number zero nhi ho jata tb tk ...|
            int lastDigit = n % 10;// last digit find krenge
            rev *= 10; // uske bad Rev me 10 se multiply krenge 

            rev += lastDigit;// and fir usme lastdigit add krenge
            n /= 10;
        }
        System.out.println(rev);

    }

}
