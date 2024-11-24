public class ForEachLoopExercise {
    public static void main(String[] args) {
        int [] arr = {1, 5, 20,60};
        int sum = 0;

        for (int i: arr){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
