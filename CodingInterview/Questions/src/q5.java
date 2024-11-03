import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number = " );
        int a = scanner.nextInt();

        System.out.println("Enter Number = " );
        int b = scanner.nextInt();

        int c = a ^ b;

        if (c == 0) {
            System.out.println("Numbers are equal" );

        }
        else{
            System.out.println("Numbers are not equal");
        }



    }
}