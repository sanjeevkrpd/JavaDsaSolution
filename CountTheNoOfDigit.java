package JavaDsaSolution;

public class CountTheNoOfDigit {
    public static void main(String[] args) {
       //  countDigit(3454);
       System.out.println(count(4545));
    }

    static void countDigit(int no){
        
        int count=0;
        while(no!=0){
            count++;
            no/=10;
            
        }

        System.out.println(count);
    }
    static int count(int no){
        if(no<10){
            return 1;
        }

        return 1+count(no/10);
    }
}
