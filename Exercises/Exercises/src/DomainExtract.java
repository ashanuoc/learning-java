public class DomainExtract {
    public static void main(String[] args) {
        String email = "info@jennyslecture.com";
        String[] words = email.split("@");

        System.out.println("Domain: " + words[1]);

    }
}
