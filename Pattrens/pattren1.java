public class pattren1{
    public static void main(String[] args) {
     pattren(4);
    }
    static  void pattren(int n) {
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}