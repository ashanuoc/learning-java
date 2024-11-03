import java.io.IOException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a isCitizen (True / False): ");
        boolean isCitizen = scanner.nextBoolean();

        if (age >= 18 && isCitizen){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You are not eligible");
        }



    }
}
