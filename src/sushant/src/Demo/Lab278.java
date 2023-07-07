
package Demo;
import java.util.*;
public class Lab278 {
	public static void main(String ar[]) {
		System.out.println("please enter the number to check prime or not");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean checkprime=true;
		if(number<=1) {
			checkprime=false;
		}else {
			for(int i=2;i<number;i++) {
				if(number%i==0 && number%number==0) {
					checkprime=true;
					break;
				}}}		
			if(checkprime) {
				System.out.println("the number" +number+ "is prime number");
			}else {
				System.out.println("the number" +number+ "is not a prime");
			}
		
	}

}
