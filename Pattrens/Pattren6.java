import java.util.Scanner;

public class Pattren6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Calculate leading dashes
            int leadingDashes = (i % 2 == 0) ? (i / 2) : ((i - 1) / 2);
            // Print leading dashes
            for (int j = 0; j < leadingDashes; j++) {
                System.out.print("- ");
            }
            // Calculate number of stars
            int stars = (i % 2 == 0) ? (i / 2) : ((i + 1) / 2);
            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            // Print trailing dash if not the first row
            if (i > 1) {
                System.out.print("- ");
            }
            System.out.println(); // New line after each row
        }
        sc.close();
    }
}
