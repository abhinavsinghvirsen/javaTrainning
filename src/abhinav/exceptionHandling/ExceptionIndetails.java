package abhinav.exceptionHandling;

import java.util.Locale;
import java.util.Scanner;

public class ExceptionIndetails {

    public static void main(String[] args) {

        try{

            System.out.println("enter your roll");
            Scanner sc = new Scanner(System.in);
             String roll = sc.next();

            System.out.println("roll is"+ roll.toUpperCase());
            int a = Integer.parseInt(roll);

            System.out.println("your roll no is "+roll);
             Double d= Double.valueOf(a/0);
            System.out.println(d);
            System.out.println(5/0);

        }catch(Exception e){
            //int c = 5/0;
            System.out.println("please enter roll which contain only number"+"  number format");
        }finally {
            System.out.println("hello krishna");
        }







    }
}
