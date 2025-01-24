public class PatternPrinting13 {
    public static void main(String[] args) {
        for (int i = 1; i<=7; i++){
            if (i<=4){
                for (int j=1; j<=4-i; j++){
                    System.out.print(" ");
                }

                for (int k =1; k<=i; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else {

                for (int k =1; k<=i-4; k++){
                    System.out.print(" ");
                }
                for (int j=8-i; j>=1; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
