import java.util.Scanner;

public class TrafficLightSimulation {
    static String DriverAction(String color){
        return switch (color){
          case "red" -> "Stop";
          case "green" -> "Go";
          case "yelllow" -> "Ready to Stop";
          default -> "Invalid color";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a color (red/green/yellow): ");
        String color = scanner.next().toLowerCase();

        String result = DriverAction(color);
        System.out.println(result);

    }
}
