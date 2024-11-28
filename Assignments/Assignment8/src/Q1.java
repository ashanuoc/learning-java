import java.util.Scanner;

//Q1. Write a Java program that takes an integer between 1 and 9 as input and prints the corresponding word (e.g., 1 -> "One", 2 -> "Two", ..., 9 -> "Nine") using a switch statement.
//•	If the input is not between 1 and 9, print "Invalid input"
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number between 1 and 9: ");
        int num = scanner.nextInt();
        String word;

        switch (num){
            case 1: word = "One";
                break;
            case 2: word = "Two";
                break;
            case 3: word = "Three";
                break;
            case 4: word = "Four";
                break;
            case 5: word = "Five";
                break;
            case 6: word = "Six";
                break;
            case 7: word = "Seven";
                break;
            case 8: word = "Eight";
                break;
            case 9: word = "Nine";
                break;
            default: word = "Invalid input";
        }
        System.out.println(word);
    }
}
