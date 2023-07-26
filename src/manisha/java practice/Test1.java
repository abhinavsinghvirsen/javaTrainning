import java.util.Scanner;

public class Test1 {
    public static void main(String []args){
        System.out.println("Please enter the number to check if it is prime or not");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        boolean checkPrime=true;
        if(number<=1){
            checkPrime=false; 
        }
        else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    checkPrime=false;
                    break;
                }
            }
        }
        if(checkPrime){
            System.out.println("The number "+number+" is prime number");
        }
        else{
            System.out.println("The number "+number+" is not a prime number");
        }

    }
}


