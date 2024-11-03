import java.util.Scanner;

public class NumOfDaysInMonth {
    static String DaysInMonth(int month){
        return switch (month){
            case 1,3,5,7,8,10,12 -> {
                System.out.println("Testing yield");
                yield "31 days in month";
            }
            case 4,6,9,11 -> "30 days in month";
            case 2 -> "28 days in month (29 days in a leap year";
            default -> "Invalid month";
        };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter month in number (1-12): ");
        int month = scanner.nextInt();

        String result = DaysInMonth(month);
        System.out.println(result);



//        switch (month){
//            case 1,3,5,7,8,10,12 ->
//            {
//                System.out.println("31 days in month");
//
//            }
//            case 4,6,9,11 ->
//            {
//                System.out.println("30 days in month");
//
//            }
//            case 2 ->
//            {
//                System.out.println("28 days in month (29 days in a leap year");
//
//            }
//            default ->
//            {
//                System.out.println("Invalid month");
//
//            }
//        }

//        switch (month){
//            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//            {
//                System.out.println("31 days in month");
//                break;
//            }
//            case 4: case 6: case 9: case 11:{
//                System.out.println("30 days in month");
//                break;
//            }
//            case 2:{
//                System.out.println("28 days in month (29 days in a leap year");
//                break;
//            }
//            default:{
//                System.out.println("Invalid month");
//                break;
//            }
//        }
    }
}
