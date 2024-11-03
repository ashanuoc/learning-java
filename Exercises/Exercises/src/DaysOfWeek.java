public class DaysOfWeek {
    static String dayOfWeek(){
        enum Day {Saturday, Sunday}
        Day day = Day.Saturday;
        return switch (day){
            case Saturday, Sunday ->  "Weekend";
            default -> "Weekday";

        };
    }
    public static void main(String[] args) {

        String result = dayOfWeek();
        System.out.println(result);




    }
}
