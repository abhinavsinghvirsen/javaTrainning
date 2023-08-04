import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        System.out.println("Please enter a number to it's factorial");
        Scanner sc= new Scanner(System.in);
        int number =sc.nextInt();
        long fact=1;
        for(int i=1;i<=number;i++)
            fact=fact*i;
        System.out.println("The factorial of"+number+"is"+fact);
    }
}