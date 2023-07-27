import java.util.Scanner;

public class Test2 {
    public static void main(String []args){
        System.out.println("Please enter start and end number to generate prime numbers");
        Scanner sc = new Scanner(System.in);
        int start= sc.nextInt();
        int end= sc.nextInt();

        for(int j=start;j<end;j++){
        boolean checkPrime=true;
        if(j<=1){
            checkPrime=false; 
        }
        else{
            for(int i=2;i<j;i++){
                if(j % i ==0){
                   checkPrime=false;
                   break;
                }
            }
        }
        if(checkPrime){
            System.out.println("The number "+j+" is a prime number");
        }
        }
    }
}
