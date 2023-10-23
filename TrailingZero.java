package JavaDsaSolution;

import java.util.Scanner;

public class TrailingZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no to find the  last most zeros : " );

        int no = sc.nextInt();

        System.out.println("Last Most Zeroes : " + trailingZero(no));
    }

    static int trailingZero(int no){

        int divideBy5=5;
        int res=0;
        while(no>=divideBy5){

            res = res + (no/divideBy5);

            divideBy5*=5;
        }
        return res;
    }
}
