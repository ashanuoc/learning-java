import java.util.Scanner;

public class Greetings {
    static void greet(String name, String time){
        System.out.println("Good " + time + " !, " + name);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter time (morning, evening, etc): ");
        String time = scanner.nextLine();

        greet(name, time);
    }
}
