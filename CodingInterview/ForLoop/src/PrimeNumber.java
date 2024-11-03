// WAP to check if a number is prime or not.
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();

        boolean isPrime = true;

        if (n<=1){
            System.out.println(n + " is not a prime number");
            isPrime =false;
        }
        else if (n==2){
            System.out.println(n + " is a prime number");
        }
        else if (n%2==0) {
            System.out.println(n + " is not a prime number");
            isPrime =false;
        }
        else {
            for (int i=3; i<=Math.sqrt(n); i+=2){
                if (n%i==0){
                    System.out.println(n + " is not a prime number");
                    isPrime =false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println(n+ " is a prime number");
        }



    }
}
