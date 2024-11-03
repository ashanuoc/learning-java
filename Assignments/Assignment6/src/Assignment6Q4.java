import java.io.IOException;
import java.util.Scanner;

public class Assignment6Q4 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter float number 1: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter float number 2: ");
        float num2 = scanner.nextFloat();

        float product = num1 * num2;

        System.out.print("Product: " + product);

    }
}
