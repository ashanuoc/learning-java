public class ReplaceUnderscoresWithSpaces {
    public static void main(String[] args) {
        String input = " Hello_World ";
        String inputTrim = input.trim().replace('_', ' ');

        System.out.println(inputTrim);

    }
}
