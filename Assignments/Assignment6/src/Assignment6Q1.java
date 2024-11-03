import java.io.IOException;
import java.util.Scanner;

public class Assignment6Q1 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length: ");
        float length = scanner.nextFloat();

        System.out.print("Enter Breadth:");
        float breadth = scanner.nextFloat();

        float area = length * breadth;

        System.out.print("Area of rectangle: " + area);

    }
}
