public class Lab62 {
    static String str1 ;
    public static void main( String[]  args ) {

        int a = 2_45_12_452 ;

        int _12 = 9889 ;

        int b = _12 ;

        long l = 21474897689l ;

        double d = 1_2_3_4.5_6 ; 

        // double d1 = 1234_.56 ;  Underscores have to be located within digits
       
        //   double d2 = 1234._87 ; Underscores have to be located within digits

          double d3 = 1234.567 ;
          double d4 = 123.4567 ;
        
        int hex = 0X1_A_F ;

        int bainary = 0b0_01_01;

        int e = 0_77;

      //  float f1 = 12987.65 ;   Type mismatch: cannot convert from double to float
          
        float f1 = 12987.65f ;

        System.out.println(f1) ; // 12987.65

        // int f = 234_ ; Underscores have to be located within digits

        // int c = _234 ; cannot resovel to variable

       // int hex = 0X_1_A_F ; Underscores have to be located within digits

       // int bainary = 0b_101; Underscores have to be located within digits


        
        String str2 = null ;
        
        System.out.println( str2 )  ; // null

        System.out.println( str1 ) ;  // null

        System.out.println(a); // 24512452

        System.out.println(b); // 9889

        System.out.println(_12); // 9889

        System.out.println(d); // 1234.56

        System.out.println(hex); // 431

        System.out.println(bainary); // 5

        System.out.println(e); // 63

       // System.out.println(9880979999) ; The literal 9880979999 of type int is out of range






    }
}
