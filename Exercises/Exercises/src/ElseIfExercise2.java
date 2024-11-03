// WAP to check number is positive zero or negative

import java.util.Scanner;

public class ElseIfExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if(num > 0){
            System.out.println("Number is positive");
        }
        else if(num == 0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is negative");
        }
    }
}
