import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number = " );
        int a = scanner.nextInt();

        int c = a & a - 1 ;

        if (c == 0) {
            System.out.println("Number " + a + " is power of two");

        }
        else{
            System.out.println("Number " + a + " is not power of two");
        }



    }
}