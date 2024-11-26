import java.util.Scanner;

public class TotalNumberOfDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (>0): ");
        int num = scanner.nextInt();

        int i = 1;
        int count = 0;

        while (i <= Math.sqrt(num)){
            if ((num % i == 0) && (num / i != i)){
                count += 2;
            } else if ((num % i == 0) && (num / i == i)) {
                count ++;
            }

            i++;
        }
        System.out.println("total number of divisors of number " + num + " is: " + count);



//        int i = 1;
//        int count = 0;
//
//        while (i<=num/2){
//            if (num % i == 0){
//                count++;
//            }
//
//            i++;
//        }
//
//        count +=1; // include the number itself
//        System.out.println("total number of divisors of number " + num + " is: " + count);


        scanner.close();
    }
}
