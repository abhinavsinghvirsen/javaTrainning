package priyo;

public class Lab107 {

    public static void main(String[] args) {
        
        byte b1 = 12 ;
         byte b2 = 23 ;
        // byte b3 =  b1 + b2 ;  Type mismatch: cannot convert from int to byte

        byte b3 = (byte) (b1 + b2) ;

         System.out.println(b3) ; 
    }
    
}
