import java.io.IOException;
import java.util.Scanner;

public class Assignment6Q2 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Base: ");
        float length = scanner.nextFloat();

        System.out.print("Enter Height:");
        float height = scanner.nextFloat();

        float area = length * height / 2;

        System.out.print("Area of triangle: " + area);

    }
}
