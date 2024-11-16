public class JumpStatements {
    public static void main(String[] args) {

        int num = 4;

        outer:
        if (num > 0){
            System.out.println("Number is positive");

            if (num % 2 == 0){
                System.out.println("Number is even");
            }
            else {
                System.out.println("Number is odd");
                break outer;
            }

            System.out.println("This will only print if the number is even");
        }
        System.out.println("This is outside the labeled block");

//        outerLoop:for (int i = 0; i < 3; i++){
//            innerLoop:for (int j = 0; j < 3; j++){
//
//                if (i ==1 && j == 1){
//                    System.out.println("breaking both loop");
//                    break outerLoop;
//                }
//                System.out.println("i: " + i + " j: " + j);
//            }
//
//        }

//        for (int i=1; i<10; i++){
//            if (i==5){
//                break;
//            }
//            System.out.println(i);
//        }
    }
}
