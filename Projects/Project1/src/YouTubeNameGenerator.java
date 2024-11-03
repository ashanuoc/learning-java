import java.io.IOException;
import java.util.Scanner;

public class YouTubeNameGenerator {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Whats your nick name: ");
        String name = scanner.nextLine();

        System.out.print("What is the next word you want to add: ");
        String next_name = scanner.nextLine();

        System.out.print("Your YT channel name could be: " + name + ' ' + next_name);


    }

}
