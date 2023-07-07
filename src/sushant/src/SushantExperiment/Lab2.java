package SushantExperiment;

import java.util.Scanner;

public class Lab2 {
	public static void main(String ar[]) {
		System.out.println("please enter the number to check prime or not");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		if(x%1==0 && x%x==0) {
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
}
}