package Array;

public class maximumValueOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 24, 89, 10};
        int max = maxValueOfArray(arr);
        System.out.println(max);
    }

    static int maxValueOfArray(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }
}
