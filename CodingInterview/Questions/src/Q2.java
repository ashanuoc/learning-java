import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entaer value A = " );
        int a = scanner.nextInt();
//        System.out.println("old A = " +  a);
        System.out.println("Entaer value B = " );
        int b = scanner.nextInt();
//        System.out.println("old B = " +  b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("new A = " +  a);
        System.out.println("new B = " +  b);

    }
}