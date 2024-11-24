import java.util.Scanner;

//Q6. Write a Java program to check if a given number is divisible by both 5 and 13 using if-else.
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 5 == 0 && num % 13 == 0){
            System.out.print(num + " is divisible by both 5 and 13");
        }
        else System.out.print(num + " is not divisible by both 5 and 13");
    }
}
