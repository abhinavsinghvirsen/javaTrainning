import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        System.out.println("Please enter a number to get factorial");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        long fact = 1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("factorial of" +number+ "is" +fact);

    }
}



