import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float radius = scanner.nextFloat();

        final float PI = 3.14F;

        float area = PI * radius * radius;
        float circumference = 2 * PI * radius;

        System.out.println("Circumference : " + circumference);
        System.out.println("Area :" + area);
    }
}
