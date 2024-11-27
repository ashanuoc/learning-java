import java.util.Scanner;

public class CoffeOrderingDoWhile {
    public static void main(String[] args) {
        int price = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************\n" +
                "\u263A Welcome to Coffee Cafe! \u2615\n" +
                "*****************************\n");
        int coffee;

        do {
            System.out.println("Type of coffee\n" +
                    "1.\tEspresso – ₹200\n" +
                    "2.\tCappuccino – ₹250\n" +
                    "3.\tLatte – ₹300\n");

            System.out.print("Provide the number for the selected coffee: ");
            coffee = scanner.nextInt();

            if (coffee < 1 || coffee > 3){
                System.out.println("Invalid choice");
            }
        }
        while (coffee < 1 || coffee > 3);


        if (coffee == 1){
            price += 200;
        } else if (coffee == 2) {
            price += 250;
        }
        else{
            price += 300;
        }

        int addOn;

        do {
            System.out.print("Do you need Add-Ons (yes=1 / no=0): ");
            addOn = scanner.nextInt();
            if (addOn < 0 || addOn > 2){
                System.out.println("Invalid choice");
            }
        }while (addOn < 0 || addOn > 2);

        if (addOn == 1){
            int addCream;
            do {
                System.out.println("Add whipped cream for ₹30? (yes=1 / no=0):");
                addCream = scanner.nextInt();
                if (addCream < 0 || addCream > 2){
                    System.out.println("Invalid choice");
                }
            }while (addCream < 0 || addCream > 2);

            if (addCream == 1){
                price += 30;
            }

            int addFlavor;
            do {
                System.out.println("Add a flavor shot? (Vanilla for ₹20 or Hazelnut for ₹25) (yes=1 / no=0):");
                addFlavor = scanner.nextInt();

                if (addFlavor < 0 || addFlavor > 2){
                    System.out.println("Invalid choice");
                }
            }while (addFlavor < 0 || addFlavor > 2);

            if (addFlavor == 1){
                int flavor;
                do {
                    System.out.println("Which one? (Enter 1 for Vanilla & 2 for Hazelnut):");
                    flavor = scanner.nextInt();

                    if (flavor < 0 || flavor > 2){
                        System.out.println("Invalid choice");
                    }
                }while (flavor < 0 || flavor > 2);

                if (flavor == 1){
                    price += 20;
                }
                else{
                    price += 25;
                }
            }
        }

        System.out.println("Total bill: ₹" + price);

        scanner.close();
    }
}
