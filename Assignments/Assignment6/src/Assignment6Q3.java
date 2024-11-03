import java.io.IOException;
import java.util.Scanner;

public class Assignment6Q3 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principle amount: ");
        float amount = scanner.nextFloat();

        System.out.print("Enter rate:");
        float rate = scanner.nextFloat();

        System.out.print("Enter time(years):");
        float time = scanner.nextFloat();

        float interest = amount * rate *time / 100;

        System.out.print("Simple Interest: " + interest);

    }
}
