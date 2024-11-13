import java.util.Scanner;

public class MenuDrivenCalculator {
    static float add(float a, float b){
        return a + b;
    }
    static float sub(float a, float b){
        return a - b;
    }
    static float multiply(float a, float b){
        return a * b;
    }
    static float div(float a, float b){
        return a / b;
    }
    static float mod(float a, float b){
        return a % b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        float num1, num2;

        do {
            System.out.print("***Calclulator***\n1 Addition \n2 Subtract \n3 Multiplication \n4 Division " +
                    "\n5 Mod \n6 Exit \nPlease enter an option: ");
            option = scanner.nextInt();

            if (option<1 || option>6){
                System.out.println("Invalid Entry");
            }
            else {


                switch (option){
                    case 1 -> {
                            System.out.print("Enter number 1: ");
                            num1 = scanner.nextFloat();
                            System.out.print("Enter number 2: ");
                            num2 = scanner.nextFloat();
                            System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                    }
                    case 2 ->{
                            System.out.print("Enter number 1: ");
                            num1 = scanner.nextFloat();
                            System.out.print("Enter number 2: ");
                            num2 = scanner.nextFloat();
                            System.out.println(num1 + " - " + num2 + " = " + sub(num1, num2));
                    }
                    case 3 -> {
                            System.out.print("Enter number 1: ");
                            num1 = scanner.nextFloat();
                            System.out.print("Enter number 2: ");
                            num2 = scanner.nextFloat();
                            System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                    }
                    case 4 -> {
                            System.out.print("Enter number 1: ");
                            num1 = scanner.nextFloat();
                            System.out.print("Enter number 2: ");
                            num2 = scanner.nextFloat();
                            System.out.println(num1 + " / " + num2 + " = " + div(num1, num2));
                    }
                    case 5 -> {
                            System.out.print("Enter number 1: ");
                            num1 = scanner.nextFloat();
                            System.out.print("Enter number 2: ");
                            num2 = scanner.nextFloat();
                            System.out.println(num1 + " % " + num2 + " = " + mod(num1, num2));
                    }
                    default -> System.out.println("Exiting Calculator...");
                };

            }



        }while (option!=6);
        scanner.close();
    }
}
