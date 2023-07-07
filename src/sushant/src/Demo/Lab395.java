package Demo;

public class Lab395 {
public static void main(String arg[]) {
	Hellort h=new Hellort();
	int n=4;
	long fact=h.factorial(n);
	System.out.println("factorial is:"+fact);
	}
}
class Hellort{
	long factorial(int n) {
		if(n==0||n==1)
			return 1;
		else
			return n*factorial(n-1);
		
	}
}