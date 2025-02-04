public class PatternPrinting26 {
    public static void main(String[] args) {
        for (int i=5; i>=1; i--) {
            for (int k=5; k>i; k--){
                System.out.print(k+" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print(i+" ");
            }
            for (int k=i+1; k<=5; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for (int i=2; i<=5; i++) {
            for (int k=5; k>i; k--){
                System.out.print(k+" ");
            }
            for (int j=2*i-1; j>=1; j--){
                System.out.print(i+" ");
            }
            for (int k=i+1; k<=5; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
