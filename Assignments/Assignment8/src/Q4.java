/*Q4. Write a Java program that converts a given integer (1 to 10) into its corresponding Roman numeral using a switch
        expression.
    •	The Roman numerals are:  1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V", 6 -> "VI", 7 -> "VII",
        8 -> "VIII", 9 -> "IX", 10 -> "X"
    •	If the input is not in the range of 1 to 10, print "Invalid input"*/

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number between 1 and 10: ");
        int num = scanner.nextInt();
        String word;

        switch (num){
            case 1: word = "I";
                break;
            case 2: word = "II";
                break;
            case 3: word = "III";
                break;
            case 4: word = "IV";
                break;
            case 5: word = "V";
                break;
            case 6: word = "VI";
                break;
            case 7: word = "VII";
                break;
            case 8: word = "VIII";
                break;
            case 9: word = "IX";
                break;
            case 10: word = "X";
                break;
            default: word = "Invalid input";
        }
        System.out.println(word);

        scanner.close();
    }

}
