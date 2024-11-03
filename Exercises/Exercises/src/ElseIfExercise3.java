// Implement a simple calculator

import java.util.Objects;
import java.util.Scanner;

public class ElseIfExercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter operator (+, -, *, /, %): ");
        String op = scanner.next();

        System.out.print("Enter num 1: ");
        float num2 = scanner.nextFloat();

        if(Objects.equals(op, "+")){
            System.out.print(num1 + " + " + num2 + " = " + (num1 + num2) );
        }
        else if (Objects.equals(op, "-")) {
            System.out.print(num1 + " - " + num2 + " = " + (num1 - num2) );
        }
        else if (Objects.equals(op, "*")) {
            System.out.print(num1 + " * " + num2 + " = " + (num1 * num2) );
        }
        else if (Objects.equals(op, "/")) {
            System.out.print(num1 + " / " + num2 + " = " + (num1 / num2) );
        }
        else if (Objects.equals(op, "%")) {
            System.out.print(num1 + " % " + num2 + " = " + (num1 % num2) );
        }

    }
}
