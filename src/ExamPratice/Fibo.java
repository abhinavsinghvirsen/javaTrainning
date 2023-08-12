package ExamPratice;

import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the limit") ;

        int limit = sc.nextInt() ;

        int a = 0 ,b = 1 ;

        for(int i = 0 ; i < limit ; i ++  ){

            System.out.println(a + " ") ;

            int c = a + b ;

            a = b ;

            b = c ;
        }
    }
}
