import java.util.Scanner;

public class Fibonacci{
   
    public static void main(String[] args) {

        System.out.println("Enter the limit");

        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();

        int a =0;
        int b = 1;

        
        for(int i = 0; i < limit; i++){
            System.out.println(a+"\t");
            int c = a + b ;

            a = b;
            b = c;
            
        }


        
    }
}
