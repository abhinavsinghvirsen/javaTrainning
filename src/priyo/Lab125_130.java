package priyo;

public class Lab125_130 {
    
    public static void main(String[] args) {
        
        int a = 12 ;
         a += a++ ;
         System.out.println(a) ; // 24

         a += ++a ;
         System.out.println(a); // 49

         byte b = 127 ;
          // b = b + 1 ; Type mismatch: cannot convert from int to byte
          b++ ;
          System.out.println(b) ; // -128

          System.out.println('A' == 65) ; // t
          byte b1 = 65 ;
          System.out.println('A' == b1) ; // t
          System.out.println(b1 == 65) ; // t

          System.out.println('A' == 65l) ; // t
          System.out.println('A' == 65.0) ; // t
          System.out.println('A' == 65.0F) ; // t

          double d1 = 13/3.0f ;
          double d2 = 13/3.0 ;
          System.out.println(d1) ; // 4.333333492279053
          System.out.println(d2) ; // 4.333333333333333
          System.out.println(d1 == d2) ; // f







    }
}
