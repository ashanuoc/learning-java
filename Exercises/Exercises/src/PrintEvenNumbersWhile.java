//WAP to print even numbers between 2 to 20
public class PrintEvenNumbersWhile {
    public static void main(String[] args) {
        int i = 2;

        while (i<=20){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
