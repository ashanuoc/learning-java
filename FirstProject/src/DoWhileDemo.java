import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number between 1 and 50: ");
            num = scanner.nextInt();
            if (num < 1 || num > 50){
                System.out.println("Invalid number!");
            }
        } while (num < 1 || num > 50);
        System.out.println("Thank you");


//        int i = 1;
//
//        do {
//            System.out.println(i);
//            i++;
//        } while (i<=1);
    }
}
