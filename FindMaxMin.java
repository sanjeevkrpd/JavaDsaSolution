package JavaDsaSolution;

public class FindMaxMin {
 

    static void findMax(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

    static void findMin(int[] arr){
        
            int min=arr[0];

            for (int i = 0; i < arr.length; i++) {
                if(min>arr[i]){
                    min=arr[i];
                }
            }

        System.out.println(min);
    }

    public static void main(String[] args) {
        
        int[] arr={54,75,123,7,78};

        findMax(arr);
        findMin(arr);
        
    }
}