import java.util.Scanner;

/*Q3. Write a Java program that evaluates and print the price of a drink based on its type using Switch Expression. The prices are as follows (in Indian Rupees):
        •	Coffee → 50
        •	Tea → 30
        •	Juice → 70
        •	Water → 20
        •	If the drink type is invalid, display "Invalid drink"*/
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*******Drinks*******");
        System.out.println("Coffee");
        System.out.println("Tea");
        System.out.println("Juice");
        System.out.println("Water");
        System.out.println("********************");

        System.out.print("Enter the drink: ");
        String  drink = scanner.next();

        int price;

        switch (drink){
            case "Coffee" -> System.out.println("Price of the drink is $" + 50);
            case "Tea" -> System.out.println("Price of the drink is $" + 30);
            case "Juice" -> System.out.println("Price of the drink is $" + 70);
            case "Water" -> System.out.println("Price of the drink is $" + 20);
            default -> System.out.println("Invalid drink");
        }

        scanner.close();


//        int num = scanner.nextInt();
    }
}
