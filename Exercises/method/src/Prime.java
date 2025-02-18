import java.util.Scanner;

public class Prime {
    static void checkPrime(int num){
        for (int i =2; i<=(int)Math.sqrt(num); i++){
            if (num % i == 0){
                System.out.println(num + " is not a prime");
                return;
            }
        }
        System.out.println(num + " is a prime");
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        checkPrime(num);
    }
}
