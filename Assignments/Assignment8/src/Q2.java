import java.util.Scanner;

/*  Q2 Write a Java program that takes an integer (1 to 12) representing a month number and prints the corresponding month name using a switch statement.
        •	If the input is invalid (not between 1 and 12), print "Invalid month number".*/
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number between 1 and 12: ");
        int num = scanner.nextInt();
        String word;

        switch (num){
            case 1:{
                word = "January";
                break;
            }
            case 2:{
                word = "February";
                break;
            }
            case 3:{
                word = "March";
                break;
            }
            case 4:{
                word = "April";
                break;
            }
            case 5:{
                word = "May";
                break;
            }
            case 6:{
                word = "June";
                break;
            }
            case 7:{
                word = "July";
                break;
            }
            case 8:{
                word = "August";
                break;
            }
            case 9:{
                word = "September";
                break;
            }
            case 10:{
                word = "October";
                break;
            }
            case 11:{
                word = "November";
                break;
            }
            case 12:{
                word = "December";
                break;
            }
            default: word = "Invalid input";
        }
        System.out.println(word);

        scanner.close();
    }
}
