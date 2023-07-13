package SushantExperiment;
import java.util.*;
public class Factorial {
	public static void main(String arg[]) {
		System.out.println("please enter a number to get factorial ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		long fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		System.out.println("factorial of"+number+"is"+fact);	
		}
	}

}
