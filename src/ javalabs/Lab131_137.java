public class Lab131_137 {
    
    public static void main(String[] args) {
        
        System.out.println( 10 > 20 ) ;
        System.out.println( 10 >= 20 ) ;
        System.out.println( 10 <= 20 ) ;
        System.out.println( 10 < 20 ) ;
        System.out.println( 10 == 20 ) ;
        System.out.println( 10 >= 10 ) ;
        System.out.println( 10 <= 10 ) ;
        System.out.println( 10 == 12 ) ;
        
        System.out.println( true == false ) ;
        System.out.println( true == true ) ;
        System.out.println( true != false) ;

       /*  System.out.println( true >= true  ) ; The operator >= is undefined for the argument type(s) boolean, boolean
        System.out.println( true == 0 ) ; The operator == is undefined for the argument type(s) boolean, int */

        String str = null ;
        Hii h = null ;
        Object obj = null ;

        System.out.println(str == obj) ;
       // System.out.println(str == h) ;     Incompatible operand types String and Hello

       int a= 10 ;

      // System.out.println("result is : " + a == 10);  Incompatible operand types String and int

      System.out.println("result is : " + (a == 10)); 

       




    }
}


