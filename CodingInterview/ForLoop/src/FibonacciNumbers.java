import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();


        if (num==1){
            System.out.println(num-1);
        }
        else if (num==2){
            System.out.println(num-1);
        }
        else{
            System.out.println("0");
            System.out.println("1");

            for (int i=0, j=1; num-2>0; num--){

                int fib = i + j;
                System.out.println(fib);
                i=j;
                j=fib;

            }
        }




    }
}