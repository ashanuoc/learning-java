//WAP to print even numbers between 2 to 20
public class PrintEvenNumbersWhile {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;

        while (i<=20){
            if (i%2==0){
                System.out.println(i);
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of even numbers = " + sum);
    }
}
