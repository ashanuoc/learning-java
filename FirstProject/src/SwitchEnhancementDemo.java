import java.util.Scanner;

public class SwitchEnhancementDemo {
    static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
//        int sum = add(2, 3);
//        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number(1-7): ");

        int dayNumber = scanner.nextInt();
        String result = switch (dayNumber){
            case 1,2,3,4,5-> "Weekday";
            case 6,7 -> "Weekend";
            default -> "Invalid";
        };

        System.out.println(result);
    }
}
