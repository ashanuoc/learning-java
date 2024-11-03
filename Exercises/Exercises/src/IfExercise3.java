// WAP to check the number is even, positive or zero

import java.util.Scanner;

public class IfExercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num >=0 && (num & 1) == 0){
            System.out.println("The number is even, positve and greater than zero");
        }
        else{
            System.out.println("The number is not even, positve and greater than zero");
        }

        scanner.close();
    }
}
