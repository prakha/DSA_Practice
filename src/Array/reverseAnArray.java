package Array;
import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 11};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int lastIndex = arr.length-1;
        for(int i = 0; i < arr.length/2; i++){
            swap(arr, i, lastIndex - i);
        }
    }
    static void swap(int[] arr, int index1, int index2){
        for(int i=0; i<arr.length; i++){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }
}
