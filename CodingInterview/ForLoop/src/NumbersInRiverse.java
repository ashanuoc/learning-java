import java.util.Scanner;

public class NumbersInRiverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();


        for (; num>0; num--){
            System.out.println(num);
        }

    }
}
