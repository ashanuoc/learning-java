// WAP to check if a number is palindrome.
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        String n = scanner.next();
        int len = n.length();

        boolean isPalindrome = true;

        for (int i=0, j=len-1; i<j; i++, j--){
            if (n.charAt(i) != n.charAt(j)){
                System.out.println(n + " is not a palindrome");
                isPalindrome =false;
                break;
            }

        }

        if (isPalindrome){
            System.out.println(n + " is a palindrome");
        }

    }
}
