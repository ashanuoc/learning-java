import java.io.IOException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        float w = scanner.nextFloat();

        System.out.print("Enter height (meter)");
        float h = scanner.nextFloat();

        float bmi = w / (h * h);

        System.out.print("Your BMI is " + bmi);
    }
}
