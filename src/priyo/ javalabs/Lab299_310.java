public class Lab299_310 {

    public static void main(String[] args) {

//        int a ;
//        a = 10 ;
//        System.out.println(a) ;  10


//        Odisha od = new Odisha() ;
//        System.out.println(od.a) ; 0


        // System.out.println(Odisha.a) ;


       /* Odisha oo = new Odisha() ;
        System.out.println("main: "+oo.a) ;  main: 10 (print 2nd) */



        // System.out.println("main : "+ Odisha.a) ;  main : 0


        // System.out.println("main : "+ Odisha.a) ;


       /* System.out.println(Odisha.a) ; // 10 [2nd print]
        System.out.println(Odisha.a) ; // 10 [2nd print]  */




       /* Odisha od = null ;
        System.out.println("ref created") ; ref created */




       /* Odisha od = null ;
        System.out.println("ref created") ; 1st print
        od = new Odisha() ;  */



//        Odisha o1 = new Odisha() ;
//        new Odisha() ;




      //  System.out.println("main : "+Odisha.a) ;





       // System.out.println("main in Lab310") ; 2nd print


    }

    //    static {
//        System.out.println("static block in lab310") ; print 1st
//    }


}





class Odisha {

       // int  a ;
     // a = 10 ; unexpected token


    /* static int a ;
    a = 10 ;   unexpected token */


   /* int a ;
    {
        a = 10 ;
        System.out.println(" instance block : "+a) ; initialized block : 10 (print 1st)
    } */



   /* static int a ;
    {
        a = 10 ;
        System.out.println(" instance block : "+a) ;
    } */



   /* static int a ;

   static {
        a = 10;
        System.out.println("instance block : " + a);
    } */




   /* static int a  = 10 ;

    {
        System.out.println("instance block") ;
    }

    static
    {
        System.out.println("static block") ;  1st print
    }   */






    /* static int a  = 10 ;

    {
        System.out.println("instance block") ;
    }

    static
    {
        System.out.println("static block") ;
    } */







  /*  static int a  = 10 ;

    {
        System.out.println("instance block") ; 3rd print
    }

    static
    {
        System.out.println("static block") ; 2nd print
    }    */









   /* {
        System.out.println("instance block") ; // 2nd print 2 times
    }

    static
    {
        System.out.println("static block") ; // 1st print
    }    */




    /* static int a ;
    int b ;

    static {

        a = 19 ;
        //  b = 10 ; Non-static field 'b' cannot be referenced from a static context
        System.out.println("static block") ;

    } */





























}
