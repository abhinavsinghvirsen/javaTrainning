public class Lab396_397 {

    public static void main(String[] args) {

        /*

        int a = 90 ;

        Demo396_397 dd  = new Demo396_397() ;

        System.out.println("main begin : " +a) ;

        dd.m1(a) ;

        System.out.println("main end : " +a) ;

         */




        Hai hai = new Hai() ;
        hai.a = 99 ;

        Demo396_397 dd = new Demo396_397() ;

        System.out.println("main begin : " + hai.a) ;

        dd.m1(hai) ;

        System.out.println("main begin : " + hai.a) ;


    }
}

class Demo396_397 {

    /*
    void m1( int a) {

        System.out.println("m1 begin : " + a) ;

        a += 10 ;

        System.out.println("m1 end : " + a) ;
    }



    main begin : 90
        m1 begin : 90
        m1 end : 100
        main end : 90

*/

     void m1(Hai hai) {

         System.out.println("m1 begin : "+ hai.a) ;
         
         hai = new Hai() ;

         hai.a = hai.a + 10 ;

         System.out.println("m1 end : "+ hai.a) ;

     }
}

class Hai {

    int a ;
}