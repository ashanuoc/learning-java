import java.io.IOException;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a VIP (True / False): ");
        boolean isvip = scanner.nextBoolean();

        System.out.print("Do you have a hasTicket (True / False): ");
        boolean hasTicket = scanner.nextBoolean();

        if (age >= 18 && (isvip || hasTicket)){
            System.out.println("You can enter to the concert");
        }
        else{
            System.out.println("You can not enter to the concert");
        }



    }
}