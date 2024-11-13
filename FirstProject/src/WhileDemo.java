import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
//        int i = 1;
//        while (true){
//            System.out.println(i);
//            i++;
//
//            if (i>5){
//                break;
//            }
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 50: ");
        int num = scanner.nextInt();

        while (true) {

            if (num > 0 && num <=50){
                System.out.println("Thank you");
                break;
            }
            else {
                System.out.println("Invalid number!");
                System.out.print("Please enter a number between 1 and 50: ");
                System.out.print("Enter a number between 1 and 50: ");
                num = scanner.nextInt();
            }

        }

    }
}
