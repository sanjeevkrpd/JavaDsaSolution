package JavaDsaSolution;
import java.util.Arrays;

public class ReverseArray {


    // Time complexity O(log n)
    static void reverse(int[] arr){

        int start=0;
        int end=arr.length-1;
        while(start<=end){

            swap(arr, start, end);
            start++;
            end--;


        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,3,5,6,1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}



