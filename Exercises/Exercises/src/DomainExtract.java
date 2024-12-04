// Extract domain from an email using substring method
public class DomainExtract {
    public static void main(String[] args) {
        String email = "info@jennyslecture.com";
        String[] words = email.split("@");
        int ind = email.indexOf("@");
        String domain = email.substring(ind + 1);
        System.out.println("Domain: " + domain);

    }
}
