// WAP to count digits in a number.
import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        int count = 0;

        for (; num>0;){
            num /= 10;
            count++;
        }

        System.out.println(count);
}
}
