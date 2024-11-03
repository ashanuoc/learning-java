import java.io.IOException;
import java.util.Scanner;

public class Assignment6Q5 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        byte num1 = scanner.nextByte();

        System.out.print("Enter number 2: ");
        short num2 = scanner.nextShort();

        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter number 4: ");
        long num4 = scanner.nextLong();

        System.out.print("Enter number 5: ");
        float num5 = scanner.nextFloat();

        System.out.print("Enter number 6: ");
        double num6 = scanner.nextDouble();

        System.out.print("Enter number 7: ");
        boolean num7 = scanner.nextBoolean();

        System.out.println("byte num: " + num1);
        System.out.println("short num: " + num2);
        System.out.println("int num: " + num3);
        System.out.println("long num: " + num4);
        System.out.println("float num: " + num5);
        System.out.println("double num: " + num6);
        System.out.println("boolean num: " + num7);

    }
}
