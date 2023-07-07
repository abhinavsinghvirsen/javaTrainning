package priyo;

public class Lab311_321 {

    public static void main(String[] args) {

    //    Puri p1 = new Puri() ;


     //       Puri p2 = new Puri() ;


       // System.out.println("main : "+Puri.a) ; 3rd print [main:0]


     /*   Puri pp = new Puri() ;
        System.out.println("main : " + pp.a) ; 3rd print [main:10] */


      //  System.out.println("main in Lab17 : " + Puri.a) ; 3rd print [main in Lab17 : 10]


      //  Puri p = new Puri() ;



       /* Puri pp = new Puri() ;
        System.out.println("Main in lab20 : "+ pp.a) ; cannot resolve symbol a  */


       /* System.out.println("Main in lab21 : "+ Puri.a) ; cannot resolve symbol a  */





    }
}




class Puri {

   /* int a = 10 ;
    static int b = 20 ;

    {
        int c = 30 ;
        System.out.println(a) ; 10
        System.out.println(b) ; 20
        System.out.println(c) ; 30
    } */





  /*  int a ;
    static int b ;

    {
        int c = 30 ;
        System.out.println(a) ; 0
        System.out.println(b) ; 0
        System.out.println(c) ; 30
    } */





   /* int a;
    static int b;

    {
        int c;
        System.out.println(a); // 0
        System.out.println(b); // 0
        System.out.println(c); // Variable 'c' might not have been initialized


    }  */




    /* static int  a ;
    static{

        static int b ; Modifier 'static' not allowed here

        System.out.println(a) ;
        System.out.println(b) ;

    } */





   /* static int  a ;
    static {

        final int b = 29;
        System.out.println(a);   1st print [0]
        System.out.println(b);   2nd print [29]

    } */





/* int a =10 ;

    {
        System.out.println("block 1 : "+a) ; 1st print [block 1 : 10]
    }
    {
        System.out.println("block 2 : "+a) ; 2nd print [block 1 : 10 ]
    }  */






   /* static int a =10 ;

    static{
        System.out.println("block 1 : "+a) ; // 1st print [block 1 : 10]
    }
   static {
        System.out.println("block 2 : "+a) ; // 2nd print [block 1 : 10 ]
    } */




   /* {
        int a = 10 ;
        System.out.println("block 1 : "  + a) ; block 1 : 10
    }
    {
        String a = "ac" ;
        System.out.println("block 2 :  " + a) ; block 2 :  ac
    } */




    /* {
        int a = 10 ;
        System.out.println("block 1 : "+ a) ;
    }
    {
        System.out.println("block2 : "+a) ; Cannot resolve symbol 'a'
    }  */



    /* {
        int a = 10 ;
        System.out.println("block1 : " +a) ;
    } */





    static {
        int a = 10 ;
        System.out.println("block1 : " + a) ;
    }














}