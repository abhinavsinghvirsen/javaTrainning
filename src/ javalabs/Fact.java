import java.util.Scanner ;

public class Fact {
    public static void main(String[] args) {
        
        System.out.println("Enter the number") ;
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        
        int fact = 1 ;

        for(int i = a ; i >= 1 ; i--) {
            fact *= i ;
        }

        System.out.println("factorial of "+a+" is = "+fact) ;
    }
    
}
