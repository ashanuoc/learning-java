import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String input = "apple,banana,cherry,date,elderberry";
        String[] output = input.split(",", 3);
        System.out.println(Arrays.toString(output));
    }
}
