import java.util.Scanner;

public class Discount {
    static void calculatePrice(int quantity, double price, boolean isMember){
        double totalPrice;
        if (isMember){
            totalPrice = quantity * price * 0.85;
        }
        else {
            totalPrice = quantity * price;
        }
        System.out.println("Total price = " + totalPrice);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.println("Enter price: ");
        double price = scanner.nextDouble();

        System.out.println("Are you a member (true/false): ");
        boolean isMember = scanner.nextBoolean();

        calculatePrice( quantity, price, isMember);
    }
}
