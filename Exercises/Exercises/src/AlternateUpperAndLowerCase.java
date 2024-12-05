public class AlternateUpperAndLowerCase {
    public static void main(String[] args) {
        String input = "hello world";
        int counter = 0;

        for (int i = 0; i < input.length(); i++){

            char ch = input.charAt(i);

            if (ch != ' '){
                if (counter % 2==0) {
                    System.out.print(Character.toUpperCase(ch));
                }
                else{
                    System.out.print(ch);
                }

                counter++;
            }
            else {
                System.out.print(ch);
            }


        }
    }
}
