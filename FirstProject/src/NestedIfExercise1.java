// WAP that determines a person can vote based on age and citizenship status

import java.util.Scanner;

public class NestedIfExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {

            System.out.print("Are you a citizen (true or false)? : ");
            boolean isCitizen = scanner.nextBoolean();

            if (isCitizen) {
                System.out.print("You are eligible to vote");
            } else {
                System.out.print("You are not eligible to vote. Apply for citizenship");
            }
        }
        else{
            System.out.print("You are not eligible to vote");
        }

    }
}
