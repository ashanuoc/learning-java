import java.util.Arrays;

/*
    WAP to reverse an array. Your task is to write a method that reverses the elements of the array in place, such that
    the first element becomes the last, the second element becomes the second last, and so on.
*/
public class ReverseArray {
    public static Arrays arrayRevers(int[] arr){
        int n = arr.length;
        int temp;
        for(int i = 0; i <= n/2; i++){
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        return Arrays.arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,52,8,61,34,3,7};


    }
}
