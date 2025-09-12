package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1; // yha bde number k liye hm long data type ka use krenge
        for(int i =1; i <=n; i++){
            fact = fact *i;
           
        }
        System.out.println(fact);
    }
    
}
