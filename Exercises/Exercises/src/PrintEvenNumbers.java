// WAP to print even numbers between 2 and 20 using for loop
public class PrintEvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            }
        }
    }
}
