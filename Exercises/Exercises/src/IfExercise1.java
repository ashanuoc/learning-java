// WAP that check if a number is positive

import java.util.Scanner;

public class IfExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0){
            System.out.println("The number you have entered is positive number");
        }
        else{
            System.out.println("The number you have entered is not positive number");
        }

    }
}
