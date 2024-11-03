// WAP to calculate the sum of numbers from 1 to 10 using for loop
public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=10; i++){
            sum = sum + i;
        }

        System.out.println("Sum: " + sum);
    }
}
