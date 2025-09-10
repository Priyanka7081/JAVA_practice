public class Diamond {
    public static void main(String[] args) {
        diamond(5);   // यहाँ 5 मतलब आधे डायमंड की height
    }

    static void diamond(int n) {
        // Upper half (including middle row)
        for (int row = 1; row <= n; row++) {
            // spaces
            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }
            // stars
            for (int col = 0; col < (2 * row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int row = n - 1; row >= 1; row--) {
            // spaces
            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }
            // stars
            for (int col = 0; col < (2 * row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
