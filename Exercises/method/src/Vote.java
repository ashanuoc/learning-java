public class Vote {
    static boolean eligible(int age){
        if (age >=18){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        boolean vote = eligible(15);
        System.out.println(vote);

    }
}
