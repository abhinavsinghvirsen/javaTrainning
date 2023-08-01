public class Fact {

    public static void main(String[] args) {

        int i , fact = 1 ;

        int n = 5 ;

        fact = factorialOfnumber(n) ;

        System.out.println("factorial of" + n + "is" ) ;


    }

    static int factorialOfnumber(int n) {

        if( n == 0 ) {

            return 1 ;

        } else {

            return (n * factorialOfnumber(n-1)) ;
        }
    }
}


