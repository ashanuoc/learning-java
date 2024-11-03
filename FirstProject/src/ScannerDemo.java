import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Welcome");
//        int x=System.in.read();
//        System.out.println(x);
        System.out.println("What is your name: ");
        Scanner scanner=new Scanner(System.in);
//        String name=scanner.next();
//        String name=scanner.nextLine();
        int n1=scanner.nextInt();
        System.out.println("Your name is " + n1);
    }
}
