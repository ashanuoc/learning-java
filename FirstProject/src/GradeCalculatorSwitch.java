import java.util.Scanner;

public class GradeCalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you marks: ");
        int marks = scanner.nextInt();

        switch (marks ){
            case 90,91,92,93,94,95,96,97,98,99,100:
                System.out.println("Grade A");
            break;
            case 80,81,82,83,84,85,86,87,88,89:
                System.out.println("Grade B");
                break;
            case 70,71,72,73,74,75,76,78,79:
                System.out.println("Grade C");
                break;
            case 60,61,62,63,64,65,67,68,69:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Grade F");
                break;

        }

    }
}
