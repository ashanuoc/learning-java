import java.util.Scanner;

// Print numbers from 1 to n. For multiples of 3, print “Fizz”, for multiples of 5, print “Buzz” and for multiples of both print “FizzBuzz”.
public class FizzBuzzProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();

        for (; num>0; num--){
            if (num % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if (num % 5 == 0){
                System.out.println("Buzz");
            }
            else if (num % 3 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(num);
            }
        }
    }
}
