import java.io.IOException;
import java.util.Scanner;

public class Assignment5Q2 {

    public static void main(String[] args) throws IOException {
        final int c = 12;

        System.out.print("Inches: ");
        Scanner scanner = new Scanner(System.in);

        float inches = scanner.nextFloat();
        float feet = inches / c;

        System.out.print("Feet: " + feet);

    }
}
