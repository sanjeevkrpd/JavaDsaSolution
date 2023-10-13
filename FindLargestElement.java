package JavaDsaSolution;


public class FindLargestElement {

    static int searchIndex(int[] arr,int target){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return 0;
    }




    public static void main(String[] args) {
        
        int[] arr = new int[]{15,3,7,2,19,14,6,1};

         int max=0;
       for(int i = 0; i < arr.length; i++) {
         if(arr[i]>max){
            max=arr[i];
         }
       }
         System.out.println(max);
         System.out.println(searchIndex(arr, max));
    }
}
