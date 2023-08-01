import java.util.Scanner;

public class CheckPrimeNumberBtweenRange {

    public static void main(String[] args) {
        
        System.out.println("Enter 1st number") ;
        Scanner sc = new Scanner(System.in) ;
        int firstNumber = sc.nextInt() ;
        System.out.println("Enter End number") ;
        int lastNumber = sc.nextInt() ;
        
        for(int i = firstNumber ; i < lastNumber ; i++){
            boolean checkPrime = true ;
            if(i<=1){
                checkPrime = false ;
            } else {
                for(int j = 2 ; j < i ; j++ ){
                    if(i%j == 0){
                        checkPrime = false ;
                        break;
                    }
                } 
            }
            if(checkPrime) {
                
                System.out.println("the number "+ i + " is prime number") ;
            }
        }

         
    }
    
}
