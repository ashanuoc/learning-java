// WAP to print sum of even numbers between 1 and N.
import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i=0; i<=n; i++){
            if (i%2==0) {
                sum += i;
            }
        }

        System.out.println("sum of even numbers between 1 and " + n + " = " + sum);
    }
}
