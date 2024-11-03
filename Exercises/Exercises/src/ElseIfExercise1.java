//WAP that assigns letter grades based on score

import java.util.Scanner;

public class ElseIfExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int score = scanner.nextInt();


        if (score < 0 || score > 100){
            System.out.println("Your Mark is out of range");
        }
        else {
            if (score >= 90){
                System.out.println("Your grade is A");
            }
            else if(score >= 80){
                System.out.println("Your grade is B");
            }
            else if(score >= 70){
                System.out.println("Your grade is C");
            }
            else if(score >= 60){
                System.out.println("Your grade is D");
            }
            else{
                System.out.println("Your grade is F");
            }
        }

        scanner.close();
    }
}
