public class Pattren3 {
    public static void main(String[] args) {
        pattren2(5);
    }
    static void pattren2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
