// WAP that check number is positive and then even or odd

import java.util.Scanner;

public class NestedIfExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entera number: ");
        int num = scanner.nextInt();

        if (num >= 0) {
            if (num % 2 == 0){
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is odd");
            }
        }
        else{
            System.out.println("Number is not positive");
        }

    }
}
