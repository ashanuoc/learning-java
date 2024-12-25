import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100);
        System.out.println("Computer selected a number between 1 to 100");

        Scanner scanner = new Scanner(System.in);

        int attempt = 1;
        int totalAttempt = 7;

        while (true){
            System.out.println("Attempt " + attempt + "/" + totalAttempt);
            System.out.print("Guess the number: ");
            int guessNum = scanner.nextInt();

            if (guessNum < 1 || guessNum > 100){
                continue;
            }

            if (guessNum > num){
                System.out.println("Too High");
            } else if (guessNum < num) {
                System.out.println("Too Low");
            }else {
                System.out.println("Correct");
                System.out.println("You won!!!");
                break;
            }
            if (attempt==totalAttempt){
                System.out.println("You are out of attempts...");
                System.out.println("The correct number is " + num);
                break;
            }
            attempt++;


        }






    }
}
