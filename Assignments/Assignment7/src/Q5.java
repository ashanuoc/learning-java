import java.util.Scanner;

//Q5. Write a Java program to find the second largest number among three given numbers using if-else.
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();

        int secondMax = 0;

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                secondMax = num2;
            } else {
                secondMax = num3;
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                secondMax = num1;
            } else {
                secondMax = num3;
            }
        } else if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                secondMax = num1;
            } else {
                secondMax = num2;
            }
        }
        System.out.println("Second max number is " + secondMax);
        }
    }

