public class Lab143 {
    
    public static void main(String[] args) {
        
        int a = 99 ;

        long b = 65799999 ;

        boolean b1 = (a == 99) && (b == 65799999 ) ;

        boolean b2 = ( a == 99 ) && ( b == 65799990 ) ;

        System.out.println(b1) ; // t

        System.out.println( b2 ) ; // f

    }
}
