import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter number from 1 to 7: ");
        int num = scanner.nextInt();

        switch (num){
            case 1: System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid Day Choice");
        }

//        switch (num){
//            case 1, 2, 3, 4, 5: System.out.println("Weekday");
//                break;
//
//            case 6: case 7:
//                System.out.println("Weekend");
//                break;
//
//            default :
//                System.out.println("Invalid Day Choice");
//        }



        scanner.close();
    }
}
