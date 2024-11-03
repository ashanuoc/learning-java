import java.util.Scanner;

public class CoffeeOrderingSwitch {
    public static void main(String[] args) {
        int price = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************\n" +
                "\u263A Welcome to Coffee Cafe! \u2615\n" +
                "*****************************\n");


        System.out.println("Type of coffee\n" +
                "1.\tEspresso – ₹200\n" +
                "2.\tCappuccino – ₹250\n" +
                "3.\tLatte – ₹300\n");

        System.out.print("Provide the number for the selected coffee: ");
        int coffee = scanner.nextInt();

        switch (coffee){
            case 1:
                price += 200;
                break;
            case 2:
                price += 250;
                break;
            case 3:
                price += 300;
                break;
            default:
                System.out.println("Invalid choice");

        }

        if (price > 0){
            System.out.println("Add whipped cream for ₹30? (yes=1 / no=0):");
            int addCream = scanner.nextInt();
            switch (addCream) {
                case 0:
                    break;
                case 1:
                    price += 30;
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Add a flavor shot? (Vanilla for ₹20 or Hazelnut for ₹25) (yes=1 / no=0):");
            int addFlavor = scanner.nextInt();

            switch (addFlavor) {
                case 0:
                    break;
                case 1:
                    System.out.println("Which one? (Enter 1 for Vanilla & 2 for Hazelnut):");
                    int flavor = scanner.nextInt();

                    switch (flavor) {
                        case 1:
                            price += 20;
                            break;
                        case 2:
                            price += 25;
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        System.out.println("Total bill: ₹" + price);

        scanner.close();
    }
}
