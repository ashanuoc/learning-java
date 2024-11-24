import java.util.Scanner;

//Q1. WAP to find maximum of three numbers without using ternary operator. (use if else)
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();

        int max;

        if (num1 > num2 && num1 > num3){
            max = num1;
        }
        else if (num2 > num3){
            max = num2;
        }
        else {
            max = num3;
        }

        System.out.println("Max number is " + max);
    }
}
