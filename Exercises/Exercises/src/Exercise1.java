import java.io.IOException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  number 1: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter  number 2: ");
        float num2 = scanner.nextFloat();

        System.out.print("Enter  number 3 ");
        float num3 = scanner.nextFloat();

        float tempMax = (num1 > num2) ? num1 : num2;
        float maxNum = tempMax > num3 ? tempMax : num3;

        float max = num1 > num2 ? (num1>num3 ? num1:num3) : (num2>num3 ? num2:num3);

        System.out.print("Maximum number is " + max);
    }
}
