package abhinav.exceptionHandling;

import java.lang.Error;

import java.lang.Exception;

public class ExampleExceptionHandling {

    public static void main(String[] args) {


     //   int a[] = new int[1];
      //  System.out.println(a[3]);
        // int cv=5/0;


   //StudeCV ccc= null;
  //  ccc.m1();

      //  StudeCV obj = new StudeCV();
     //   int c=   obj.m2(10);
      //  System.out.println(c);

      //  int a = Integer.parseInt("vxzbzxbbzb");

      //  System.out.println(a);

      //  System.out.println(args[2]);

       /* for (int i=0;i<10;i++){


            try{

                System.out.println(i);
                System.out.println(10/i);

            }catch (Exception e){
                System.out.println(e);
            }

        }
*/




        try {

            int c =5/0;



        }catch(  NullPointerException  | ArithmeticException  e){

            if(e instanceof  ArithmeticException){
                System.out.println("arth");
            }

            if(e instanceof  NullPointerException){

                System.out.println("null");
            }

            System.out.println("helo");
        }



    }
}
class StudeCV{


  void  m1(int b){


    }

}


