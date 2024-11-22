public class PatternPrinting8 {
    public static void main(String[] args) {
        for (int i =1; i <= 4; i++){
            for (int j = 4; j > 0; j--){
                if (j-i > 0){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int k = 2; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();


        }
        for (int i =1; i <= 4; i++) {
            if (i > 1) {
                for (int j = 1; j <= 4; j++) {
                    if (j < i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                for (int j = 3; j >= i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
