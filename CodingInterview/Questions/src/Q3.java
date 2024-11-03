import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number = " );
        int a = scanner.nextInt();

        int c = a & 1 ;

        if (c == 1) {
            System.out.println("Number " + a + " is Odd");

        }
        else{
            System.out.println("Number " + a + " is Even");
        }



    }
}