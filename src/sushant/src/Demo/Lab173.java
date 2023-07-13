package Demo;

public class Lab173 {
	public static void main(String arg[]) {
		int a=10;
		int b=20;
		int c=25;
		int max=0;
		if(a>b&&a>c)
			max=a;
		else if(b>a&&b>c)
			max=b;			
		else
			max=c;
		System.out.println("Max value is"+max);
	}

}



