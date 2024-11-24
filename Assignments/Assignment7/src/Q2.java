import java.util.Scanner;

//Q2. Write a Java program that checks whether a given character is a vowel or a consonant using if-else.
public class Q2 {
    public static void main(String[] args) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u'};

        boolean isVowel = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        for (char v: vowels){
            if (v == ch){
                isVowel = true;
                break;
            }
        }
        if (isVowel)
            System.out.println(ch + " is a vowel.");
        else
            System.out.println(ch + " is not a vowel.");


    }
}
