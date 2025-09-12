package Loops;

import java.util.Scanner;

public class ReverseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // is code me given digit and uske reverse ka sum nikala gya hai
        // ex = 12 and reverse 21 so 12+ 21 = 33
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int reverse = 0;
        while(temp > 0){
             int digit = temp % 10;
             reverse = reverse * 10 ;
             reverse +=digit;
             temp/=10;
             sum = n + reverse;


        }
        System.out.println(sum);
         
    }
}
