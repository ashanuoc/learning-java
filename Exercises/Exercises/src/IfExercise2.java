// WAP that determines if a person is eligible for a senior discount

import java.util.Scanner;

public class IfExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age > 65){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You are not eligible");
        }
    }
}
