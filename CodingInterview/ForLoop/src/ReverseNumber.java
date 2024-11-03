// WAP to calculate power of a number using for loop.
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
//        int num = scanner.nextInt();
//        int lastDigit=0;
//        int reverse = 0;
//
//        for (;num>0;num/=10){
//            lastDigit = num%10;
//            reverse = reverse*10 +lastDigit;
//
//
//        }

        String num = scanner.next();
        int len = num.length();
        String reverse = "";

        for (len -=1; len>=0; len--){
            reverse += num.charAt(len);
        }


        System.out.println("reverse = " + reverse);
    }
}
