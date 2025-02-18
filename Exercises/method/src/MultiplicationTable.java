import java.util.Scanner;

public class MultiplicationTable {
    static void multipliTable(int num){
        for (int i=1; i<=12; i++){
            int mul = num * i;
            System.out.println(i + " * " + num + " = " + mul);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        multipliTable(num);
    }
}
