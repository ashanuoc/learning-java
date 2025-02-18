import java.util.Scanner;

public class Circle {
    static void area(float radius){
        double a =  Math.PI * radius * radius;
        System.out.println("Area is " + a);
    }
    static void circumference(float radius){
        double c = 2 * Math.PI * radius;
        System.out.println("Circumference is " + c);
    }
    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();

        area(radius);
        circumference(radius);
    }
}
