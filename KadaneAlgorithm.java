package JavaDsaSolution;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int maxSum=0;
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            
            if(sum<=0){
                sum=arr[i];
            }else{
                sum+=arr[i];
            }

            if(maxSum<sum){
                maxSum=sum;
            }
        }
        System.out.println(maxSum);
    }
}
