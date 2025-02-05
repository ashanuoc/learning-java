public class PatternPrinting27 {
    public static void main(String[] args) {
        int n = (int)'A';

        for (int i=n; i<=n+5; i++){
            for (int j= n; j<=i; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
