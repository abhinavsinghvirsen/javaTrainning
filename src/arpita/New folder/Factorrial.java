import java.util.Scanner;

public class Factorrial {
    public static void main(String args[]){

        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int fact =1;
        int i = 1;

                while( i < number ){

                    fact = fact*i;

                    i++;
                }

                System.out.println(fact);


    }
    
}
