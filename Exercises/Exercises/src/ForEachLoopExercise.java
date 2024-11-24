public class ForEachLoopExercise {
    public static void main(String[] args) {

        char[] charArr = new char[] {'a', 's', 'd', 'a', 'e', 'a'};

        int count = 0;

        for (char c: charArr){
            if (c == 'a'){
                count++;
            }
        }
        System.out.println("Count = " + count);


//        int [] arr = {1, 5, 20,60};
//        int sum = 0;
//
//        for (int i: arr){
//            sum += i;
//        }
//        System.out.println("Sum = " + sum);
    }
}
