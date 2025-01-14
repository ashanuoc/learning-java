import java.util.Scanner;

public class TotalNumberOfDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (>0): ");
        int num = scanner.nextInt();

        int i = 1;
        int count = 0;
        int sqrt = (int) Math.sqrt(num);

        while (i <= sqrt){
            if (num % i == 0){
                if ((num / i != i)){
                    count += 2;
                }
                else {
                    count ++;
                }
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
