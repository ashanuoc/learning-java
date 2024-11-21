public class PatternPrinting5 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= (n + 1 )/2; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print("*");
                }
            System.out.println();
        }
        for (int i = 1; i <= n/2; i++){
            for (int j = n/2; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
