// WAP to print factorial of a number using for loop.
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int fac = 1;

        if (num < 0){
            System.out.println("Invalid Number!");
        }
        else {
            for (int i = num; i >= 1; i--) {
                fac *= i;
            }
        }

        System.out.println("Factorial of " + num + "! is : " + fac);
    }
}
