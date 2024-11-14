import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (> 0): ");
        int num = scanner.nextInt();

        int i = 1;
        int sum = 0;

        while (i<=num/2){
            if (num % i == 0){
                sum += i;
            }

            i++;
        }

        if (num == sum){
            System.out.println(num + " is a perfect number");
        }
        else {
            System.out.println(num + " is not a perfect number");
        }

        scanner.close();
    }
}
