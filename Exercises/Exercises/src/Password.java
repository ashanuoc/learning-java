import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String correctPassword = "test123";
        String pw;

        do {
            System.out.print("Please enter your password: ");
            pw = scanner.next();

            if (!(correctPassword.equals(pw))){
                System.out.println("Password invalid!");
            }

        } while (!(correctPassword.equals(pw)));

        System.out.println("Your password matched!");

        scanner.close();
    }
}
