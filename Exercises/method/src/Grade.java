import java.util.Scanner;

public class Grade {
    static void displayStudentGrade(String name, char grade){
        System.out.println(name + " got " + grade + " grade.");

    }

    static char calculateGrade(int score){
        return  switch (score /10){
            case 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter marks: ");
        int score = scanner.nextInt();

        char grade = calculateGrade(score);
        displayStudentGrade(name, grade);
    }

}
