// WAP to print sum of first n natural numbers using for loop
import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();
        int sum = 0;
        if (n <1){
            System.out.println("invalid number!");
        }
        for (int i=1; i<=n; i++){
//            sum = sum + i;
            sum += i;
        }

        System.out.println("sum of first " + n + " natural numbers = " + sum);
    }
}
