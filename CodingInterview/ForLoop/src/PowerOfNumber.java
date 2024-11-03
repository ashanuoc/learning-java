import java.util.Scanner;

//  to calculate power of a number using for loop.
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        System.out.print("Enter a power: ");
        int e = scanner.nextInt();
        int pow = 1;

        for (; e>0; e--){
            pow *= num;
        }

        System.out.println("Power = " + pow);
    }
}
