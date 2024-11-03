// WAP to print factorial of a number using for loop.
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int fac = 1;

        for (; n>0; n--){
            fac *= n;
        }

        System.out.println("Factorial of " + n + "! is : " + fac);
    }
}
