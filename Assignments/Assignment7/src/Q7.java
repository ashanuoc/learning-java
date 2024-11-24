/*
Q7. Write a Java program that functions as a simple calculator using if-else.
        •	Accept two numbers and an operator (+, -, *, /) as input(take operator as character input)
        •	 Perform the respective operation and display the result
        •	Handle division by zero gracefully
*/

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        int result;

        if (op == '+'){
            result = num1 + num2;
            System.out.print("Result = " + result);
        } else if (op == '-') {
            result = num1 - num2;
            System.out.print("Result = " + result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.print("Result = " + result);
        } else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.print("Result = " + result);
            }else {
                System.out.print("Can not divide by zero");
            }
        }else {
            System.out.print("Invalid operator");
        }

    }
}
