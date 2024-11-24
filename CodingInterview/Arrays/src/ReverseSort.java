import java.util.Arrays;

//WAP to print an array in revers order
public class ReverseSort {
    public static void main(String[] args) {
        int [] arr = {1,52,8,61,34,3,7};
        System.out.println("Original: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sort: " + Arrays.toString(arr));
        int n = arr.length;
        int temp;
        for (int i=0; i < n/2; i++){
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println("Revers Sort: " + Arrays.toString(arr));


    }
}
