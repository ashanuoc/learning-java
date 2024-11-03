import java.util.Scanner;

// WAP to check if a number is palindrome.
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        String num = scanner.next();

        int len = num.length();
        int sum = 0;

        for (int i=0; i<len; i++){
            sum += Character.getNumericValue(num.charAt(i));
        }
        System.out.println("Sum of the digits of " + num + " = " + sum);
    }
}