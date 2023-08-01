public class RecursionLab_395 {

    public static void main(String[] args) {

        int n = 4 ;

        long fact = new Lab_395() . factorial(n) ;

        System.out.println("Factorial of "+ n + " = " +fact) ;

    }
}

class Lab_395
{
    long factorial(int n) {

        if(n == 0 || n == 1)

            return 1 ;

        else

            return n * factorial(n-1) ;
    }
}


// Factorial of 4 = 24