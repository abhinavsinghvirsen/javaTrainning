import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        
        System.out.println("Enter the number ") ;
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;

        boolean checkPrime = true ;

        if(a <= 1) {
            checkPrime = false ;
        } else {
            for(int i = 2 ; i < a ; i++){
                if(a % i == 0){
                    checkPrime = false ;
                    break ;
                } 
            }
        }
        if(checkPrime){
            System.out.println("number "+a+" is prime number") ;
        } else {
            System.out.println("number "+a+" is not a prime number") ;

        }
     }
    
}
