import java.util.Scanner;

public class GradeCalculator {
    static String CalculateGrade(int score){
        return switch (score / 10){
          case 10, 9 ->  "A";
          case 8 -> "B";
          case 7 -> "C";
          case 6 -> "D";
          case 0,1,2,3,4,5 -> "F";
          default -> "Invalid";

        };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score: ");
        int score = scanner.nextInt();

        String grade = CalculateGrade(score);
        System.out.println("Grade is " + grade);



    }
}
