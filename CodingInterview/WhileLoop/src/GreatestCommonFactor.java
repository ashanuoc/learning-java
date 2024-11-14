import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1 :");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2 :");
        int num2 = scanner.nextInt();

        int rem, gcd=0;

        if (num1 % num2 == 0){
            System.out.println("GCD: " + num2);
        }
        else if (num2 % num1 == 0){
            System.out.println("GCD: " + num1);
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
            System.out.println("GCD: " + gcd);
        }


        scanner.close();
    }
}
