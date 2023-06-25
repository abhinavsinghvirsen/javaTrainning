import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        
       
        Scanner sc = new Scanner(System.in) ;

        int limit = sc.nextInt() ;

        int a = 0 ;
        int b = 1 ;

        for(int i = 1 ;i <= limit ; i++) {

            System.out.println(a + "\t") ;

            int c = a+b ;
            a = b ;
            b = c ;
        }

    }
    
}
