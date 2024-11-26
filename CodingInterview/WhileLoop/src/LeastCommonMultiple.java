import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1 :");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2 :");
        int num2 = scanner.nextInt();

        int oriNum1 = num1;
        int oriNum2 = num2;

        int rem, lcm, gcd=0;

        if (num1 % num2 == 0){
            gcd = num2;
        }
        else if (num2 % num1 == 0){
            gcd = num1;
        }
        else {
            while (true){
                if (num1 > num2){
                    rem = num1 % num2;
                    num1 = rem;
                }
                else {
                    rem = num2 % num1;
                    num2 = rem;
                }

                if (rem > 0){
                    gcd = rem;
                }
                else {
                    break;
                }
            }
        }

        lcm = oriNum1 * oriNum2 / gcd;
        System.out.println("Least common multiple of " + oriNum1 + " and " + oriNum2 + " is: " + lcm);

        scanner.close();
    }
}
