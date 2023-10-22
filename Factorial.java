package TapAcademyQuestions;

public class Factorial{
    public static void main(String[] args) {
        

        int no=3;

        int fact = 1;

        for (int i = 1; i <=no; i++) {
            fact=fact*i;

        }

        System.out.println("factorial is :" +fact);

      //  System.out.println(factorial(3));
    }


    static int factorial(int no){


        if(no==1){
            return 1;
        }
        int fact=factorial(no-1);
        int f=fact*no;

         return f;

    }
}